package com.koyama.hello;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
            return "hello koyama";
    }

    @DeleteMapping("/hello")
    public String deleteHello() {
        return "delete hello";
    }
}
