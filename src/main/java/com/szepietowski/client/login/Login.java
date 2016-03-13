package com.szepietowski.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Created by Szymon on 2016-03-13.
 */
public class Login extends Composite {

    private static final LoginRestService loginRestService = GWT.create(LoginRestService.class);

    @UiField
    TextBox userBox;

    @UiField
    TextBox passwordBox;

    @UiField
    Button loginButton;

    public Login() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @UiHandler("loginButton")
    public void onButtonClick(ClickEvent e) {
        loginRestService.postCredentials(userBox.getText(), passwordBox.getText(), "Login", new MethodCallback<Void>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                Window.alert(method.getResponse().getStatusCode() + "");
            }

            @Override
            public void onSuccess(Method method, Void aVoid) {
                Window.alert(method.getResponse().getStatusCode() +  "");
            }
        });
    }

    interface LoginUiBinder extends UiBinder<HTMLPanel, Login> {
    }

    private static LoginUiBinder ourUiBinder = GWT.create(LoginUiBinder.class);
}