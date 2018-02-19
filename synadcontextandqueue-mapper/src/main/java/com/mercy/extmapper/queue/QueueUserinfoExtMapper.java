package com.mercy.extmapper.queue;

import com.mercy.model.queue.QueueUserinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface QueueUserinfoExtMapper {

    List<QueueUserinfo> selectQueueList(HashMap<String, Object> params);

    int selectQueueListRecords(HashMap<String, Object> params);

    QueueUserinfo selectMaxQueueUserInfo(HashMap<String, Object> params);

    void updateByPrimarykeyBatch(ArrayList<Object> users);
}