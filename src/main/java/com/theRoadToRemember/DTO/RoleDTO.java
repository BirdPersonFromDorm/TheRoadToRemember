package com.theRoadToRemember.DTO;

import com.theRoadToRemember.Model.User;
import lombok.*;

import javax.persistence.Entity;
import java.sql.ConnectionBuilder;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDTO {
    private String name;
}
