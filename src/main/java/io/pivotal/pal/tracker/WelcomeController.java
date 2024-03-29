package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    private final String message;

    public WelcomeController(@Value("${welcome_message}") String message) {
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }

//    @GetMapping("/hi/{name}")
//    public String sayHelloToName(@PathVariable String name) {
//        return "hello "+ name;
//    }
}
