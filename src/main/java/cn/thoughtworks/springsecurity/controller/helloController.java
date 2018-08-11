package cn.thoughtworks.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class helloController {

    @GetMapping("")
    public String sayHello() {
        return "Hello, World!";
    }
}
