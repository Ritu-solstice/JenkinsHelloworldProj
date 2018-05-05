package com.example.HelloWorld.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class Controller {
    Logger log = LoggerFactory.getLogger(Controller.class);
    @GetMapping("/")
    public String defaultFunc(){
        log.info("Landed to default API");
        return "Landed to default API";
    }
}
