package com.mercy.queue;

import com.mercy.dto.QueueListDTO;
import com.mercy.excption.MyOwnerException;
import com.mercy.model.queue.QueueUserinfo;
import com.mercy.service.queue.QueueCoreService;
import com.mercy.utils.ResultDTOWithPagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@SpringBootApplication
public class QueueApplication {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(QueueApplication.class, args);
    }

    private QueueCoreService coreService;

    @PostMapping(value = "/getQueueList")
    public ResultDTOWithPagination<List<QueueUserinfo>> getQueueList(QueueListDTO dto) {
        logger.info("QueueApplication.getQueueList params:{}", dto);
        ResultDTOWithPagination<List<QueueUserinfo>> result =
                new ResultDTOWithPagination<>(true, null, "查询成功!");
        try {
            coreService.getQueueList(dto);
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
