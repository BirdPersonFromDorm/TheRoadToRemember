package com.theRoadToRemember.Service;

import com.theRoadToRemember.Model.User;
import com.theRoadToRemember.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public User getUserByID(Long id){
        return userRepository.getById(id);
    }

}
