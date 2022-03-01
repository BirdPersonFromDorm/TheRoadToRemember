package com.theRoadToRemember.Controller;

import com.theRoadToRemember.DTO.CardDTO;
import com.theRoadToRemember.Mapper.CardMapper;
import com.theRoadToRemember.Model.Card;
import com.theRoadToRemember.Service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/card")
    public ResponseEntity<?> saveCard(@RequestBody CardDTO cardDTO){
        Card card = cardMapper.toEntity(cardDTO);
        card = cardService.addCard(card);
        cardDTO = cardMapper.toDTO(card);
        return new ResponseEntity<>(cardDTO, HttpStatus.CREATED);
    }
}
