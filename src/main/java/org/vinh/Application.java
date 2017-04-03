package org.vinh;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import org.vinh.api.SmsApi;
import org.vinh.api.impl.SmsApiImpl;
import org.vinh.constants.SmsConstants;
import org.vinh.models.User;

/**
 * Description.
 * <p>
 * Author: Vinh Pham
 * Date: 04/04/2017
 * Time: 00:27
 */
public class Application extends AbstractVerticle {
    private static final String HTTP_HOST = "0.0.0.0";
    private static final int HTTP_PORT = 8082;

    private SmsApi smsService;

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Router router = Router.router(vertx);
        router.post(SmsConstants.SEND_MESSAGE).handler(this::sendMessage);

        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(HTTP_PORT, HTTP_HOST, result -> {
                    if (result.succeeded()) {
                        startFuture.complete();
                    }else {
                        startFuture.fail(result.cause());
                    }
                });
        init();
    }

    private void sendMessage(RoutingContext routingContext) {
        String userId = routingContext.request().formAttributes().get("user");
        String message = routingContext.get("message");
        //asynchronous call to smsService.sendMessage
    }
    //use DI later.
    private void init(){
        smsService = new SmsApiImpl();
    }

}
