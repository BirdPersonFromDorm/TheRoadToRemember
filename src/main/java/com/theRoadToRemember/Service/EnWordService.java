package com.theRoadToRemember.Service;

import com.theRoadToRemember.Model.EnWord;
import com.theRoadToRemember.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnWordService {
    @Autowired
    private CardRepository enWorkRepository;

//    public EnWord getEnWord(Long id){
//        return enWorkRepository.getById(id);
//    }
}
