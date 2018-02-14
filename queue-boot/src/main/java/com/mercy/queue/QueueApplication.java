package com.mercy.queue;

import com.mercy.service.AdcontextCoreService;
import com.mercy.service.QueueCoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QueueApplication {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(QueueApplication.class, args);
    }

    private QueueCoreService coreService;

    public void getQueueList() {
        logger.info("QueueApplication.getQueueList params:{}");




    }

}
