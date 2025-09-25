package com.example.demoJPA.demoJPA.services.implement;

import com.example.demoJPA.demoJPA.dto.RoleDTO;
import com.example.demoJPA.demoJPA.dto.UserDTO;
import com.example.demoJPA.demoJPA.entity.Users;
import com.example.demoJPA.demoJPA.mapper.UserMapper;
import com.example.demoJPA.demoJPA.repository.UserRepository;
import com.example.demoJPA.demoJPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {

        /*  Cach 1 : change data type manaually

        List<UserDTO> userDTOs = new ArrayList<>();

        List<Users> users = userRepository.findAll();

        for ( Users user : users ) {
            UserDTO userDTO = new UserDTO();
            RoleDTO roleDTO = new RoleDTO();

            userDTO.setIdUser(user.getId());
            userDTO.setEmail(user.getEmail());
            roleDTO.setId(user.getRole().getId());
            roleDTO.setName(user.getRole().getName());
            userDTO.setRole(roleDTO);

            userDTOs.add(userDTO);
        }
        return userDTOs;
        */

        // map : forEach + change Data Type
        return userRepository.findAll().stream().map(UserMapper::toUserDTO).toList();

    }

}
