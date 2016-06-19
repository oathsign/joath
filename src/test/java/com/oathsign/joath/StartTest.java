package com.oathsign.joath;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StartTest {

    private Logger logger = LoggerFactory.getLogger(StartTest.class);

    @Test
    public void testLog() {
        logger.debug("ok");
        logger.debug("中文");
    }

    @Test
    public void testAdd() {
        Start start = new Start();
        Integer result = start.add(1, 2);
        assertEquals(new Integer(3), result);
    }

    @Test
    public void testTrue() {
        assertTrue(true);
    }
}
