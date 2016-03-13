package com.szepietowski.client.login;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.*;

/**
 * Created by Szymon on 2016-03-13.
 */
public interface LoginRestService extends RestService {
    @POST
    @Path("login")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("text/html")
    void postCredentials(@FormParam("username") String username, @FormParam("password") String password, @FormParam("submit") String submit, MethodCallback<Void> callback);
}
