package com.theRoadToRemember.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long imageId;
    @Column(name = "name")
    private String name;
    @Column(name = "original_filename")
    private String originalFilename;
    @Column(name = "content_type")
    private String contentType;
    @Column(name = "size")
    private Long size;
    @Lob
    @Column(name = "bytes")
    private byte[] bytes;


}
