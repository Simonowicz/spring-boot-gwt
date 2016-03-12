package com.szepietowski.client.welcome;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Welcome view
 */
public class Welcome extends Composite {
    interface WelcomeUiBinder extends UiBinder<HTMLPanel, Welcome> {}
    private static WelcomeUiBinder ourUiBinder = GWT.create(WelcomeUiBinder.class);

    public Welcome() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
