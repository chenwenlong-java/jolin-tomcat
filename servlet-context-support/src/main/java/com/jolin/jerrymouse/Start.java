package com.jolin.jerrymouse;

import com.jolin.jerrymouse.connector.HttpConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author FastJson
 * @since 2024/3/21 14:18
 */
public class Start {
    static Logger logger = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) throws Exception {
        try (HttpConnector connector = new HttpConnector()) {
            for (;;) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("jerrymouse http server was shutdown.");
    }
}