package com.theRoadToRemember.DTO;


import com.theRoadToRemember.Model.EnWord;
import com.theRoadToRemember.Model.RuWord;
import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardDTO {

    private Long rating;
    private EnWordDTO enWord;
    private RuWordDTO ruWord;
    private ImageDTO image;
}
