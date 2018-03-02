package com.mercy.extmapper.queue;

import com.mercy.model.queue.QueueOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface QueueOrderExtMapper {

    List<QueueOrder> selectQueueOrderList(HashMap<String, Object> params);

    int selectQueueOrderListRecords(HashMap<String, Object> params);
}