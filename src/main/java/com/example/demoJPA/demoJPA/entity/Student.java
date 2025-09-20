package com.example.demoJPA.demoJPA.entity;

import jakarta.persistence.*;

@Entity(name = "students")
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email" )
    private String email;

    public int getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }

    public void setEmail(String email) { this.email = email; }
}
