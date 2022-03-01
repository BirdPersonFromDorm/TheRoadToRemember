package com.theRoadToRemember.Repository;

import com.theRoadToRemember.Model.Card;
import com.theRoadToRemember.Model.EnWord;
import com.theRoadToRemember.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
    Card getById(Long id);
}
