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
    @JoinColumn(name = "en_word_id")
    private EnWord enWord;
    @ManyToOne
    @JoinColumn(name = "ru_word_id")
    private RuWord ruWord;
}
