package com.theRoadToRemember.Service;

import com.theRoadToRemember.Model.Card;
import com.theRoadToRemember.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public Card getCard(Long id){
        return cardRepository.getById(id);
    }

    public Card addCard(Card card) {
        return cardRepository.save(card);
    }
}
