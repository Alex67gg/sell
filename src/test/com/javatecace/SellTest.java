package com.javatecace;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellTest {

    @Test
    public void testLog() {
       log.info(":fdbnhjfbdsjh");
       log.error("fbdjhfb");
       log.debug("fmhbdjhfbjhs");
    }
}
