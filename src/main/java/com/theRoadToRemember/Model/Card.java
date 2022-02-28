package com.theRoadToRemember.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long cardId;
    private Long rating;
    @ManyToOne
    private EnWord enWord;
    @ManyToOne
    private RuWord ruWord;
}
