package com.theRoadToRemember.Controller;

import com.theRoadToRemember.DTO.RoleDTO;
import com.theRoadToRemember.DTO.UserDTO;
import com.theRoadToRemember.Mapper.UserMapper;
import com.theRoadToRemember.Model.Role;
import com.theRoadToRemember.Model.User;
import com.theRoadToRemember.Service.UserService;
import com.theRoadToRemember.Service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUser/{id}")
    public UserDTO getUserByID(@PathVariable Long id){
        User userByID = userService.getUserByID(id);
        return userMapper.toDTO(userByID);
    }


}
