package com.mercy.service.queue;

import com.mercy.dto.QueueListDTO;

import java.util.HashMap;

public interface QueueCoreService {

    HashMap<Object, Object> getQueueList(QueueListDTO dto) throws Exception;
}
