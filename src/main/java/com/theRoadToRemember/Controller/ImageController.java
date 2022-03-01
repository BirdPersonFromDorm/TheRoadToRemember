package com.theRoadToRemember.Controller;

import com.theRoadToRemember.DTO.ImageDTO;
import com.theRoadToRemember.Mapper.ImageMapper;
import com.theRoadToRemember.Model.Image;
import com.theRoadToRemember.Service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;
    private final ImageMapper imageMapper;

    @GetMapping("/image/{id}")
    public ResponseEntity<?> getImage(@PathVariable Long id) throws IOException {
        Image image = imageService.getImage(id);
        return ResponseEntity.ok()
                .header("fileName", image.getOriginalFilename())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(image.getBytes());
    }

    @PostMapping("/image")
    public ResponseEntity<?> getImage(@RequestParam("file") MultipartFile file) throws IOException {
        Image image = imageMapper.toEntity(file);
        image = imageService.saveImage(image);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("fileName", image.getOriginalFilename())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(image.getBytes());
    }
}
