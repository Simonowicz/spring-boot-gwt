package com.szepietowski.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.szepietowski.client.welcome.Welcome;
import org.fusesource.restygwt.client.Defaults;

/**
 * Entry point for gwt
 */
public class SpringBootGwt implements EntryPoint {
    @Override
    public void onModuleLoad() {
        useCorrectRequestBaseUrl();
        RootPanel.get().add(new Welcome());
    }

    private void useCorrectRequestBaseUrl() {
        if (isDevelopmentMode()) {
            // our spring boot server is running at port 80. If we don't change the url
            // resty gwt would use the gwt servlet port
            Defaults.setServiceRoot("http://localhost:8080");
        } else {
            // in production our compiled javascript code gets copied into
            // a 'springbootgwt' folder into the static resources. So if we
            // dont change the default url resty gwt would put the folders name
            // to the base url
            Defaults.setServiceRoot(GWT.getHostPageBaseURL());
        }
    }

    /**
     * Detect if the app is in development mode.
     *
     * @return true if in development mode
     */
    private static native boolean isDevelopmentMode()/*-{
        return typeof $wnd.__gwt_sdm !== 'undefined';
    }-*/;
}
