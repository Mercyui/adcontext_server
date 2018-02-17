package com.mercy.mapper.queue.extmapper;

import com.mercy.model.queue.QueueUserinfo;

import java.util.HashMap;
import java.util.List;

public interface QueueUserinfoExtMapper {
    List<QueueUserinfo> selectQueueList(HashMap<String, Object> params);

    int selectQueueListRecords(HashMap<String, Object> params);
}