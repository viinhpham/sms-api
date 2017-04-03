package org.vinh.api.impl;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.rxjava.core.RxHelper;
import org.vinh.api.SmsApi;
import org.vinh.models.User;
import org.vinh.services.SmsGateWay;

import java.util.Observable;

/**
 * Description.
 * <p>
 * Author: Vinh Pham
 * Date: 04/04/2017
 * Time: 00:26
 */
public class SmsApiImpl implements SmsApi {
    private SmsGateWay gateWayService;

    @Override
    public void sendMessage(String userId, String message, Handler handler) {

        //Get user from userId



        // if validate()

        // asynchronous call to SmsGateWay and retry when failure with timeout
        // = 20s and count try = 5





    }
    private void sendError(int statusCode, HttpServerResponse response) {
        response.setStatusCode(statusCode).end();
    }

    private boolean validate(User user) {
        //Validate number of sending time
        //by checking number of sending which stored in database.
        return true;
    }
}
