package com.example.demoJPA.demoJPA.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private int idUser;
    private String email;
    private RoleDTO role;
}
