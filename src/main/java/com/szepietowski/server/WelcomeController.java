package com.szepietowski.server;

import com.szepietowski.server.model.dto.WelcomeMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Welcome REST endpoint
 */
@RequestMapping("welcome")
@RestController
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<WelcomeMessage> getWelcomeMessage() {
        return ResponseEntity.ok(new WelcomeMessage("Hello World!"));
    }
}
