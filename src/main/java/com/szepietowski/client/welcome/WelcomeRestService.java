package com.szepietowski.client.welcome;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Interface defining interaction between Welcome view and service
 */
@Path("welcome")
public interface WelcomeRestService extends RestService {
    @GET
    void getWelcomeText(MethodCallback<WelcomeMessage> callback);
}
