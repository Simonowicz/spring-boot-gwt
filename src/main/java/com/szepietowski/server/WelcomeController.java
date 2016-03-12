package com.szepietowski.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Welcome REST endpoint
 */
@RequestMapping("welcome")
@RestController
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> welcome(@RequestParam("parameter") String text) {
        return ResponseEntity.ok(text);
    }
}
