package com.onroadrui.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * Created by onroadrui on 17/11/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void testLog() {
        logger.debug("hello debug");
        logger.info("hello info");
        logger.error("hello error");

    }
}
