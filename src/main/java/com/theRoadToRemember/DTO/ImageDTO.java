package com.theRoadToRemember.DTO;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageDTO {

    private String name;
    private String originalFilename;
    private String contentType;
    private Long size;
    @Lob
    private byte[] bytes;
}
