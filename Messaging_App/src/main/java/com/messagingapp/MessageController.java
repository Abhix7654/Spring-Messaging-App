package com.messagingapp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessageController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
