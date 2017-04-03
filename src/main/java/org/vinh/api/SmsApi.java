package org.vinh.api;

import io.vertx.core.Handler;

/**
 * Author: Vinh Pham
 * Date: 03/04/2017
 * Time: 12:39
 */
public interface SmsApi {
    void sendMessage(String userId, String message, Handler handler);
}
