package com.szepietowski.client.welcome;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.szepietowski.server.model.dto.WelcomeMessage;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Welcome view
 */
public class Welcome extends Composite {
    interface WelcomeUiBinder extends UiBinder<HTMLPanel, Welcome> {}
    private static WelcomeUiBinder ourUiBinder = GWT.create(WelcomeUiBinder.class);
    private static final WelcomeRestService welcomeService = GWT.create(WelcomeRestService.class);

    @UiField
    Label welcomeLabel;

    public Welcome() {
        initWidget(ourUiBinder.createAndBindUi(this));
        welcomeService.getWelcomeText(new MethodCallback<WelcomeMessage>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                Window.alert("Exception when querying controller");
                welcomeLabel.setText(throwable.getMessage());
            }

            @Override
            public void onSuccess(Method method, WelcomeMessage welcomeMessage) {
                welcomeLabel.setText(welcomeMessage.getWelcomeMessage());
            }
        });
    }
}
