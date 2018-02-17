package com.mercy.service.queue.impl;

import com.google.common.collect.Maps;
import com.mercy.dto.Pagination;
import com.mercy.dto.QueueListDTO;
import com.mercy.enums.QueueUserInfoStatusEnum;
import com.mercy.excption.MyOwnerException;
import com.mercy.mapper.queue.extmapper.QueueUserinfoExtMapper;
import com.mercy.model.queue.QueueUserinfo;
import com.mercy.service.queue.QueueCoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class QueueCoreServiceImpl implements QueueCoreService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private QueueUserinfoExtMapper queueUserinfoExtMapper;

    @Autowired
    public void setQueueUserinfoExtMapper(QueueUserinfoExtMapper queueUserinfoExtMapper) {
        this.queueUserinfoExtMapper = queueUserinfoExtMapper;
    }

    /**
     * 查询队列的列表
     *
     * @param dto 参数封装
     */
    @Override
    public HashMap<Object, Object> getQueueList(QueueListDTO dto) throws Exception {
        logger.info("QueueCoreServiceImpl.getQueueList params:{}", dto);
        if (Objects.isNull(dto))
            throw new MyOwnerException("传入的参数不能为空!");
        HashMap<String, Object> params = Maps.newHashMap();
        params.put("normal", QueueUserInfoStatusEnum.STATUS_NORMAL);
        params.put("orderBy", "a.sort_score desc,a.gmt_update desc");
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
        HashMap<Object, Object> result = Maps.newHashMap();
        result.put("data", list);
        result.put("pagination", pagination);
        return result;
    }




}
