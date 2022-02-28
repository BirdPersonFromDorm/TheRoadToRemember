package com.theRoadToRemember.Service;

import com.theRoadToRemember.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User getUserByID(Long id);

}
