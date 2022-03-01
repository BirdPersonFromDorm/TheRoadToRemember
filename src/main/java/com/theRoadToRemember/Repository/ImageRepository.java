package com.theRoadToRemember.Repository;

import com.theRoadToRemember.Model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {
    Image getById(Long id);
}
