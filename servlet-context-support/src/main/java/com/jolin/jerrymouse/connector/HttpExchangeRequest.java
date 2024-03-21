package com.jolin.jerrymouse.connector;

import com.sun.net.httpserver.Headers;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

/**
 * @author FastJson
 * @since 2024/3/21 14:23
 */
public interface HttpExchangeRequest {

    String getRequestMethod();

    URI getRequestURI();

    Headers getRequestHeaders();

    InetSocketAddress getRemoteAddress();

    InetSocketAddress getLocalAddress();

    byte[] getRequestBody() throws IOException;
}

