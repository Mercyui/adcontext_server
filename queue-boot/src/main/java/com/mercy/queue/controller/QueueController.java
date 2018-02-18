package com.mercy.queue.controller;

import com.mercy.dto.Pagination;
import com.mercy.dto.QueueListDTO;
import com.mercy.excption.MyOwnerException;
import com.mercy.service.queue.QueueCoreService;
import com.mercy.utils.ResultDTOWithPagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
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

    @GetMapping(value = "/getQueueList")
    public ResultDTOWithPagination<Object> getQueueList(QueueListDTO dto, HttpServletResponse response) {
        logger.info("QueueApplication.getQueueList params:{}", dto);
        ResultDTOWithPagination<Object> result =
                new ResultDTOWithPagination<>(true, null, "查询成功!");
        try {
            HashMap<String, Object> resultMap = queueCoreService.getQueueList(dto);
            result.setData(resultMap.get("data"));
            result.setPagination((Pagination) resultMap.get("pagination"));
            response.setHeader("Access-Control-Allow-Origin", "*");
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
