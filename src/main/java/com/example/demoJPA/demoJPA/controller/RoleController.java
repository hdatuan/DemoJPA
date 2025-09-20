package com.example.demoJPA.demoJPA.controller;

import com.example.demoJPA.demoJPA.request.InsertRoleRequest;
import com.example.demoJPA.demoJPA.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleServices roleServices;

    @PostMapping
    public ResponseEntity<?> insertRole(@RequestBody InsertRoleRequest roleRequest) {
        roleServices.insertRole(roleRequest);
        return ResponseEntity.ok("Insert role successful");
    }

}
