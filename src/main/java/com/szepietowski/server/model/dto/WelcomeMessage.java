package com.szepietowski.server.model.dto;

import java.io.Serializable;

/**
 * Transport object enabling communication with the server
 */
public class WelcomeMessage implements Serializable {
    private String welcomeMessage;

    public WelcomeMessage() {}

    public WelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String toString() {
        return "WelcomeMessage{" +
                "welcomeMessage='" + welcomeMessage + '\'' +
                '}';
    }
}
