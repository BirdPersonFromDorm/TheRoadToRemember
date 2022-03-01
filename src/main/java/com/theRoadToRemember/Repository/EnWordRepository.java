package com.theRoadToRemember.Repository;

import com.theRoadToRemember.Model.EnWord;
import org.springframework.data.repository.CrudRepository;

public interface EnWordRepository extends CrudRepository<EnWord, Long> {

    EnWord getById(Long id);
}
