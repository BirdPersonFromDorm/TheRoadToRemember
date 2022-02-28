package com.theRoadToRemember.Controller;

import com.theRoadToRemember.Model.User;
import com.theRoadToRemember.Service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestREstController {

    @Autowired
    private  UserServiceImpl userService;

    @GetMapping("/getUser/{id}")
    public User getUserByID(@PathVariable Long id){
        return userService.getUserByID(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
