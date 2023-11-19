package com.secretmanager.secretmanagerdemo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {
    @Value("${PASSWORD}")
    String password;

    @Value("${USERNAME}")
    String usernmae;

    @GetMapping("/info")
    String info() {
        return String.format("%s: %s", usernmae, password);
    }
}
