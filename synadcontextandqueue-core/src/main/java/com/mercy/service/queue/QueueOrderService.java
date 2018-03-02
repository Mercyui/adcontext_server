package com.mercy.service.queue;

import com.mercy.dto.queue.QueueOrderListDTO;
import com.mercy.dto.queue.QueueOrderReceiveDTO;

import java.util.HashMap;

public interface QueueOrderService {

    HashMap<String, Object> getQueueOrderList(QueueOrderListDTO dto) throws Exception;

    void updateReceiveOrder(QueueOrderReceiveDTO dto) throws Exception;

}
