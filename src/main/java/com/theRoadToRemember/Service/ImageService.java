package com.theRoadToRemember.Service;

import com.theRoadToRemember.Model.Image;
import com.theRoadToRemember.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public Image getImage(Long id){
        return imageRepository.getById(id);
    }
    public Image saveImage(Image image){
        return imageRepository.save(image);
    }
}
