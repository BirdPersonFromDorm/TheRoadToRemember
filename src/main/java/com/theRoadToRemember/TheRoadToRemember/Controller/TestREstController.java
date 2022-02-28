package com.theRoadToRemember.TheRoadToRemember.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestREstController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
