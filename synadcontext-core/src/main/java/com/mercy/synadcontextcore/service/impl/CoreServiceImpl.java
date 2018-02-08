package com.mercy.synadcontextcore.service.impl;

import com.mercy.synadcontextcore.service.CoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CoreServiceImpl implements CoreService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void getContextInfo() {
        logger.info("CoreServiceImpl.getContextInfo param:{}");


    }

}
