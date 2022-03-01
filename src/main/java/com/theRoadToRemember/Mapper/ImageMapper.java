package com.theRoadToRemember.Mapper;

import com.theRoadToRemember.DTO.ImageDTO;
import com.theRoadToRemember.Model.Image;
import org.mapstruct.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Mapper
public interface ImageMapper {
    ImageDTO toDTO(Image image) throws IOException;
    Image toEntity(MultipartFile file) throws IOException;
}
