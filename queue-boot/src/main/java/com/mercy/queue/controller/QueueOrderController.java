package com.mercy.queue.controller;

import com.mercy.dto.Pagination;
import com.mercy.dto.queue.QueueOrderListDTO;
import com.mercy.dto.queue.QueueOrderReceiveDTO;
import com.mercy.excption.MyOwnerException;
import com.mercy.service.queue.QueueOrderService;
import com.mercy.utils.ResultDTOWithPagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/queue_order")
public class QueueOrderController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private QueueOrderService queueOrderService;

    @Autowired
    public void setQueueOrderService(QueueOrderService queueOrderService) {
        this.queueOrderService = queueOrderService;
    }

    /**
     * 获取列表查询
     *
     * @param dto 参数封装
     * @return 返回值
     */
    @GetMapping(value = "/orderList")
    public ResultDTOWithPagination<Object> getOrderList(QueueOrderListDTO dto) {
        logger.info("QueueApplication.getOrderList params:{}", dto);
        ResultDTOWithPagination<Object> result =
                new ResultDTOWithPagination<>(true, null, "查询成功!");
        try {
            HashMap<String, Object> resultMap = queueOrderService.getQueueOrderList(dto);
            result.setData(resultMap.get("data"));
            result.setPagination((Pagination) resultMap.get("pagination"));
        } catch (MyOwnerException e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            logger.error("QueueApplication.getOrderList MyOwnerException:", e);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("查询异常");
            logger.error("QueueApplication.getOrderList error:", e);
        }
        return result;
    }
    /**
     * 新增队列成员--司机接单
     *
     * @param dto 参数封装
     * @return 返回值
     */
    @PutMapping("/orderNew")
    public ResultDTOWithPagination<Object> updateReceiveOrder(QueueOrderReceiveDTO dto) {
        logger.info("QueueApplication.updateReceiveOrder params:{}", dto);
        ResultDTOWithPagination<Object> result = new ResultDTOWithPagination<>(true, null, "插入成功!");
        try {
            queueOrderService.updateReceiveOrder(dto);
        } catch (MyOwnerException e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            logger.error("QueueApplication.insertQueueUser MyOwnerException:", e);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("查询异常");
            logger.error("QueueApplication.insertQueueUser error:", e);
        }
        return result;
    }
}



