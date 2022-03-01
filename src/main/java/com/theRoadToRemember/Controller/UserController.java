package com.theRoadToRemember.Controller;

import com.theRoadToRemember.DTO.UserDTO;
import com.theRoadToRemember.Mapper.UserMapper;
import com.theRoadToRemember.Model.User;
import com.theRoadToRemember.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @GetMapping("/getUser/{id}")
    public UserDTO getUserByID(@PathVariable Long id){
        User userByID = userService.getUserByID(id);
        return userMapper.toDTO(userByID);
    }


}
