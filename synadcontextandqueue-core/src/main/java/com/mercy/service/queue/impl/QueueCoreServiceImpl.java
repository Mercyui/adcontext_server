package com.mercy.service.queue.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mercy.dto.Pagination;
import com.mercy.dto.queue.QueueListDTO;
import com.mercy.dto.queue.QueueUserInsertDTO;
import com.mercy.enums.QueueUserInfoStatusEnum;
import com.mercy.excption.MyOwnerException;
import com.mercy.extmapper.queue.QueueUserinfoExtMapper;
import com.mercy.mapper.queue.QueueUserinfoMapper;
import com.mercy.model.queue.QueueUserinfo;
import com.mercy.model.queue.QueueUserinfoExample;
import com.mercy.service.queue.QueueCoreService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QueueCoreServiceImpl implements QueueCoreService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private QueueUserinfoExtMapper queueUserinfoExtMapper;
    private QueueUserinfoMapper queueUserinfoMapper;

    @Autowired
    public void setQueueUserinfoExtMapper(QueueUserinfoExtMapper queueUserinfoExtMapper) {
        this.queueUserinfoExtMapper = queueUserinfoExtMapper;
    }

    @Autowired
    public void setQueueUserinfoMapper(QueueUserinfoMapper queueUserinfoMapper) {
        this.queueUserinfoMapper = queueUserinfoMapper;
    }

    /**
     * 查询队列的列表
     *
     * @param dto 参数封装
     */
    @Override
    public HashMap<String, Object> getQueueList(QueueListDTO dto) throws Exception {
        logger.info("QueueCoreServiceImpl.getQueueList params:{}", dto);
        if (Objects.isNull(dto))
            throw new MyOwnerException("传入的参数不能为空!");
        HashMap<String, Object> params = Maps.newHashMap();
        params.put("normal", QueueUserInfoStatusEnum.STATUS_NORMAL.getCode());
        params.put("orderBy", "a.current_sort ASC,a.gmt_update desc");
        params.put("start", dto.getStartIndex());
        params.put("end", dto.getPageSize());
        List<QueueUserinfo> list = queueUserinfoExtMapper.selectQueueList(params);
        if (CollectionUtils.isEmpty(list))
            throw new MyOwnerException("未查询到队列的数据");
        int count = queueUserinfoExtMapper.selectQueueListRecords(params);
        Pagination pagination = new Pagination();
        pagination.setOrder(dto.getOrder());
        pagination.setPageNo(dto.getPageNo());
        pagination.setPageSize(dto.getPageSize());
        pagination.setTotalRecord(count);
        HashMap<String, Object> result = Maps.newHashMap();
        result.put("data", list);
        result.put("pagination", pagination);
        return result;
    }

    /**
     * 新增插入队列用户
     *
     * @param dto 参数封装
     * @throws Exception 异常
     */
    @Override
    public void insertQueueUser(QueueUserInsertDTO dto) throws Exception {
        logger.info("QueueCoreServiceImpl.insertQueueUser params:{}", JSONObject.toJSONString(dto));
        if (Objects.equals(dto, null))
            throw new MyOwnerException("传入的参数不能为空!");
        //先统计排名最后一个的分数
        HashMap<String, Object> params = Maps.newHashMap();
        params.put("normal", QueueUserInfoStatusEnum.STATUS_NORMAL.getCode());
        QueueUserinfo max_user = queueUserinfoExtMapper.selectMaxQueueUserInfo(params);
        QueueUserinfo userinfo = new QueueUserinfo();
        BeanUtils.copyProperties(dto, userinfo);
        userinfo.setSortScore(max_user == null ? 1 : max_user.getSortScore() + 1);
        userinfo.setUserStatus(QueueUserInfoStatusEnum.STATUS_NORMAL.getCode());
        //设置当前排名
        userinfo.setCurrentSort(max_user == null ? 1 : max_user.getCurrentSort() + 1);
        queueUserinfoMapper.insertSelective(userinfo);
    }

    /**
     * 前移队列数据
     *
     * @param dto 参数封装
     * @throws Exception 异常
     */
    @Override
    public void moveUpQueueUser(QueueListDTO dto) throws Exception {
        logger.info("QueueCoreServiceImpl.moveUpQueueUser params:{}", JSONObject.toJSONString(dto));
        if (Objects.equals(dto, null))
            throw new MyOwnerException("传入参数不能为空!");
        if (StringUtils.isBlank(dto.getUserId()))
            throw new MyOwnerException("传入的用户不能为空!");
        //先查询该用户目前的排名,如果已经是第一 就无需再进行移动
        QueueUserinfo currentUser = queueUserinfoMapper.selectByPrimaryKey(Long.valueOf(dto.getUserId()));
        Integer currentSort = currentUser.getCurrentSort();
        if (currentSort == 1) {
            throw new MyOwnerException("该用户不能再向前移动");
        }
        //用户排名向前移动一名,同时将移动前的前一位成员排名后移一位
        QueueUserinfoExample example = new QueueUserinfoExample();
        example.createCriteria().andCurrentSortEqualTo(currentSort - 1);
        List<QueueUserinfo> list = queueUserinfoMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            QueueUserinfo beforeUser = list.get(0);
            beforeUser.setCurrentSort(beforeUser.getCurrentSort() + 1);
            beforeUser.setGmtUpdate(new Date());
            currentUser.setCurrentSort(currentSort - 1);
            currentUser.setGmtUpdate(new Date());
            ArrayList<Object> users = Lists.newArrayList();
            users.add(beforeUser);
            users.add(currentUser);
            queueUserinfoExtMapper.updateByPrimarykeyBatch(users);
        }
    }

    /**
     * 后移队列数据
     *
     * @param dto 参数封装
     * @throws Exception 异常
     */
    @Override
    public void moveDownQueueUser(QueueListDTO dto) throws Exception {
        logger.info("QueueCoreServiceImpl.moveDownQueueUser params:{}", JSONObject.toJSONString(dto));
        if (Objects.equals(dto, null))
            throw new MyOwnerException("传入参数不能为空!");
        if (StringUtils.isBlank(dto.getUserId()))
            throw new MyOwnerException("传入的用户不能为空!");
        //先查询该用户目前的排名,如果已经是最后 就无需再进行移动
        QueueUserinfo currentUser = queueUserinfoMapper.selectByPrimaryKey(Long.valueOf(dto.getUserId()));
        HashMap<String, Object> params = Maps.newHashMap();
        params.put("normal", QueueUserInfoStatusEnum.STATUS_NORMAL.getCode());
        int count = queueUserinfoExtMapper.selectQueueListRecords(params);
        Integer currentSort = currentUser.getCurrentSort();
        if (currentSort == count) {
            throw new MyOwnerException("该用户不能再向后移动");
        }
        //用户排名向前移动一名,同时将移动前的后一位成员排名前移一位
        QueueUserinfoExample example = new QueueUserinfoExample();
        example.createCriteria().andCurrentSortEqualTo(currentSort + 1);
        List<QueueUserinfo> list = queueUserinfoMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            QueueUserinfo afterUser = list.get(0);
            afterUser.setCurrentSort(afterUser.getCurrentSort() - 1);
            afterUser.setGmtUpdate(new Date());
            currentUser.setCurrentSort(currentSort + 1);
            currentUser.setGmtUpdate(new Date());
            ArrayList<Object> users = Lists.newArrayList();
            users.add(afterUser);
            users.add(currentUser);
            queueUserinfoExtMapper.updateByPrimarykeyBatch(users);
        }
    }

}
