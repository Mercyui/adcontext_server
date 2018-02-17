package com.mercy.controller;

import com.mercy.config.MyLdapConfig;
import com.mercy.excption.MyOwnerException;
import com.mercy.service.adcontext.AdcontextCoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/core")
public class CoreController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private AdcontextCoreService coreService;

    private MyLdapConfig myLdapConfig;

    @Autowired
    public void setMyLdapConfig(MyLdapConfig myLdapConfig) {
        this.myLdapConfig = myLdapConfig;
    }

    @Autowired
    public void setCoreService(AdcontextCoreService coreService) {
        this.coreService = coreService;
    }

    @GetMapping(value = "/configuration")
    @ResponseBody
    public String getLdapConfig() {
        logger.info("CoreController.getLdapConfig param:{}");
        return myLdapConfig.getAdminName();
    }

    @GetMapping("/contextInfo")
    public void getContextInfo() {
        logger.info("CoreController.getContextInfo param:{}");
        try {
            coreService.getContextInfo();
        } catch (MyOwnerException e) {
            logger.error("CoreController.getContextInfo exception:", e);
            e.printStackTrace();
        } catch (Exception e) {
            logger.error("CoreController.getContextInfo error:", e);
            e.printStackTrace();
        }
    }

}
