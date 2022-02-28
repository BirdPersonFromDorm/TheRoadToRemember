package com.theRoadToRemember.Mapper;

import com.theRoadToRemember.DTO.EnWordDTO;
import com.theRoadToRemember.DTO.UserDTO;
import com.theRoadToRemember.Model.EnWord;
import com.theRoadToRemember.Model.User;
import org.mapstruct.Mapper;

@Mapper
public interface EnWordMapper {
    EnWordDTO toDTO(EnWord enWord);
}
