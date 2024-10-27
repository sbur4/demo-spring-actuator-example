package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class Controller {

    @PostMapping("/hello/{text}")
    public String actuator(@PathVariable("text") String text) {
        log.debug("Received a request for greeting with name: {}", text);

        return "Hello " + text;
    }
}