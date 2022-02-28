package com.theRoadToRemember.Mapper;

import com.theRoadToRemember.DTO.UserDTO;
import com.theRoadToRemember.Model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserDTO toDTO(User user);
}
