package com.jolin.jerrymouse.connector;

import java.net.URI;

/**
 * @author FastJson
 * @since 2024/3/21 14:23
 */
public interface HttpExchangeRequest {

    String getRequestMethod();

    URI getRequestURI();
}
