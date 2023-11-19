package com.secretmanager.secretmanagerdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/helloworld")
    String home() {
        return "Hello World!";
    }
}
