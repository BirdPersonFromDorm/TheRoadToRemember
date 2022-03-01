package com.theRoadToRemember.Controller;

import com.theRoadToRemember.DTO.EnWordDTO;
import com.theRoadToRemember.DTO.UserDTO;
import com.theRoadToRemember.Mapper.EnWordMapper;
import com.theRoadToRemember.Model.EnWord;
import com.theRoadToRemember.Model.User;
import com.theRoadToRemember.Service.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;

    private final EnWordMapper enWordMapper;
//
//    @GetMapping("/getEnWord/{id}")
//    public EnWordDTO getEnWordByID(@PathVariable Long id){
//        EnWord enWordByID = enWordService.getEnWord(id);
//        return enWordMapper.toDTO(enWordByID);
//    }

}
