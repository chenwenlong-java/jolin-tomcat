package com.jolin.jerrymouse.connector;

import com.sun.net.httpserver.Headers;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author FastJson
 * @since 2024/3/21 14:24
 */
public interface HttpExchangeResponse {

    Headers getResponseHeaders();

    void sendResponseHeaders(int rCode, long responseLength) throws IOException;

    OutputStream getResponseBody();
}
