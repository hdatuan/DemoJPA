package com.example.demoJPA.demoJPA.services;

import com.example.demoJPA.demoJPA.entity.Roles;
import com.example.demoJPA.demoJPA.repository.RoleRepository;
import com.example.demoJPA.demoJPA.request.InsertRoleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RoleServices {

    @Autowired
    private RoleRepository roleRepository;

    public boolean insertRole(InsertRoleRequest roleRequest) {
        // Create a new Role object
        Roles role = new Roles();

        // Setting properties for the new Role
        role.setName(roleRequest.getRoleName());
        role.setCreatedDate(LocalDateTime.now());

        // save the Role using roleRepository.save
        // Assign the returned object to a variable called insertedRole
        Roles insertedRole = roleRepository.save(role);

        return true;
    }
}
