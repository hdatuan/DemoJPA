package com.example.demoJPA.demoJPA.mapper;

import com.example.demoJPA.demoJPA.dto.RoleDTO;
import com.example.demoJPA.demoJPA.dto.UserDTO;
import com.example.demoJPA.demoJPA.entity.Users;

import java.util.List;

public class UserMapper {

    public static UserDTO toUserDTO(Users user) {
        UserDTO userDTO = new UserDTO();
        RoleDTO roleDTO = new RoleDTO();

        userDTO.setIdUser(user.getId());
        userDTO.setEmail(user.getEmail());
        roleDTO.setId(user.getRole().getId());
        roleDTO.setName(user.getRole().getName());
        userDTO.setRole(roleDTO);

        return userDTO;
    }
}
