package com.theRoadToRemember.Mapper;

import com.theRoadToRemember.DTO.CardDTO;
import com.theRoadToRemember.DTO.EnWordDTO;
import com.theRoadToRemember.Model.Card;
import com.theRoadToRemember.Model.EnWord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CardMapper {
    @Mapping(source = "enWord", target = "enWord")
    @Mapping(source = "ruWord", target = "ruWord")
    CardDTO toDTO(Card card);

    Card toEntity (CardDTO cardDTO);
}
