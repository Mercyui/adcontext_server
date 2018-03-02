package com.mercy.service.queue.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.mercy.dto.Pagination;
import com.mercy.dto.queue.QueueOrderListDTO;
import com.mercy.dto.queue.QueueOrderReceiveDTO;
import com.mercy.enums.QueueUserInfoStatusEnum;
import com.mercy.excption.MyOwnerException;
import com.mercy.extmapper.queue.QueueOrderExtMapper;
import com.mercy.extmapper.queue.QueueUserinfoExtMapper;
import com.mercy.mapper.queue.QueueOrderMapper;
import com.mercy.mapper.queue.QueueUserinfoMapper;
import com.mercy.model.queue.QueueOrder;
import com.mercy.model.queue.QueueUserinfo;
import com.mercy.service.queue.QueueOrderService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class QueueOrderServiceImpl implements QueueOrderService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private QueueOrderMapper queueOrderMapper;
    private QueueOrderExtMapper queueOrderExtMapper;
    private QueueUserinfoExtMapper queueUserinfoExtMapper;
    private QueueUserinfoMapper queueUserinfoMapper;


    @Autowired
    public void setQueueOrderMapper(QueueOrderMapper queueOrderMapper) {
        this.queueOrderMapper = queueOrderMapper;
    }

    @Autowired
    public void setQueueOrderExtMapper(QueueOrderExtMapper queueOrderExtMapper) {
        this.queueOrderExtMapper = queueOrderExtMapper;
    }

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
    public HashMap<String, Object> getQueueOrderList(QueueOrderListDTO dto) throws Exception {
        logger.info("QueueCoreServiceImpl.getQueueOrderList params:{}", dto);
        if (Objects.isNull(dto))
            throw new MyOwnerException("传入的参数不能为空!");
        HashMap<String, Object> params = Maps.newHashMap();
        params.put("normal", QueueUserInfoStatusEnum.STATUS_NORMAL.getCode());
        params.put("orderBy", "a.id ASC");
        params.put("start", dto.getStartIndex());
        params.put("end", dto.getPageSize());
        List<QueueOrder> list = queueOrderExtMapper.selectQueueOrderList(params);
        if (CollectionUtils.isEmpty(list))
            throw new MyOwnerException("未查询到订单的数据");
        int count = queueOrderExtMapper.selectQueueOrderListRecords(params);
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
    public void updateReceiveOrder(QueueOrderReceiveDTO dto) throws Exception {
        logger.info("QueueCoreServiceImpl.updateReceiveOrder params:{}", JSONObject.toJSONString(dto));
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
        //更新订单状态为已接单

    }

}
