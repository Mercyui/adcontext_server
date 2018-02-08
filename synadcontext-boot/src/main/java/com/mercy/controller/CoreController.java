package com.mercy.controller;

import com.mercy.synadcontextcore.service.CoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/core")
public class CoreController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private CoreService coreService;

    @Autowired
    public void setCoreService(CoreService coreService) {
        this.coreService = coreService;
    }

    @PostMapping(value = "/{}")
    public void getContextInfo() {
        logger.info("CoreController.getContextInfo param:{}");
        coreService.getContextInfo();
    }
}
