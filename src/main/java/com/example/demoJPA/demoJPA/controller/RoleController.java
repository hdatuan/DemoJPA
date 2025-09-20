package com.example.demoJPA.demoJPA.controller;

import com.example.demoJPA.demoJPA.request.InsertRoleRequest;
import com.example.demoJPA.demoJPA.request.UpdateRoleRequest;
import com.example.demoJPA.demoJPA.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping
    public ResponseEntity<?> updateRole(@RequestBody UpdateRoleRequest roleRequest) {
        boolean update = roleServices.updateRole(roleRequest);
        if ( update )
            return ResponseEntity.ok("Update role successful");
        else
            return ResponseEntity.status(404).body("Role not found");
    }

}
