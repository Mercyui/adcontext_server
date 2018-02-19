package com.mercy.service.queue;

import com.mercy.dto.queue.QueueListDTO;
import com.mercy.dto.queue.QueueUserInsertDTO;

import java.util.HashMap;

public interface QueueCoreService {

    HashMap<String, Object> getQueueList(QueueListDTO dto) throws Exception;

    void insertQueueUser(QueueUserInsertDTO dto) throws Exception;

    void moveUpQueueUser(QueueListDTO dto) throws Exception;

    void moveDownQueueUser(QueueListDTO dto) throws Exception;
}
