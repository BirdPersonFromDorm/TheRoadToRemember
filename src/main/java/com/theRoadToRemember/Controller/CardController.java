package com.theRoadToRemember.Controller;

import com.theRoadToRemember.DTO.CardDTO;
import com.theRoadToRemember.Mapper.CardMapper;
import com.theRoadToRemember.Model.Card;
import com.theRoadToRemember.Service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/getCard/{id}")
    public CardDTO getCard(@PathVariable Long id){
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }

}
