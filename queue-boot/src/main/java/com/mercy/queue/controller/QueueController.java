package com.mercy.queue.controller;

import com.mercy.dto.Pagination;
import com.mercy.dto.queue.QueueListDTO;
import com.mercy.dto.queue.QueueUserInsertDTO;
import com.mercy.excption.MyOwnerException;
import com.mercy.service.queue.QueueCoreService;
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
@RequestMapping(value = "/queue")
public class QueueController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private QueueCoreService queueCoreService;

    @Autowired
    public void setQueueCoreService(QueueCoreService queueCoreService) {
        this.queueCoreService = queueCoreService;
    }

    /**
     * 新增队列成员
     *
     * @param dto 参数封装
     * @return 返回值
     */
    @PutMapping("/queueUser")
    public ResultDTOWithPagination<Object> insertQueueUser(QueueUserInsertDTO dto) {
        logger.info("QueueApplication.insertQueueUser params:{}", dto);
        ResultDTOWithPagination<Object> result = new ResultDTOWithPagination<>(true, null, "插入成功!");
        try {
            queueCoreService.insertQueueUser(dto);
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

    /**
     * 队列数据向前移动
     *
     * @param dto 参数封装
     * @return 返回值
     */
    @PutMapping("/queueUser")
    public ResultDTOWithPagination<Object> moveUpQueueUser(QueueListDTO dto) {
        logger.info("QueueApplication.moveUpQueueUser params:{}", dto);
        ResultDTOWithPagination<Object> result = new ResultDTOWithPagination<>(true, null, "插入成功!");
        try {
            queueCoreService.moveUpQueueUser(dto);
        } catch (MyOwnerException e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            logger.error("QueueApplication.moveUpQueueUser MyOwnerException:", e);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("查询异常");
            logger.error("QueueApplication.moveUpQueueUser error:", e);
        }
        return result;
    }

    /**
     * 获取列表查询
     *
     * @param dto 参数封装
     * @return 返回值
     */
    @GetMapping(value = "/queueList")
    public ResultDTOWithPagination<Object> getQueueList(QueueListDTO dto) {
        logger.info("QueueApplication.getQueueList params:{}", dto);
        ResultDTOWithPagination<Object> result =
                new ResultDTOWithPagination<>(true, null, "查询成功!");
        try {
            HashMap<String, Object> resultMap = queueCoreService.getQueueList(dto);
            result.setData(resultMap.get("data"));
            result.setPagination((Pagination) resultMap.get("pagination"));
        } catch (MyOwnerException e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            logger.error("QueueApplication.getQueueList MyOwnerException:", e);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("查询异常");
            logger.error("QueueApplication.getQueueList error:", e);
        }
        return result;
    }
}
