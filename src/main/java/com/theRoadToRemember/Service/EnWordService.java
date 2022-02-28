package com.theRoadToRemember.Service;

import com.theRoadToRemember.Model.EnWord;
import com.theRoadToRemember.Repository.EnWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnWordService {
    @Autowired
    private EnWordRepository enWorkRepository;

    public EnWord getEnWord(Long id){
        return enWorkRepository.getById(id);
    }
}
