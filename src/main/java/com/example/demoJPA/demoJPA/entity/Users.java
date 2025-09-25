package com.example.demoJPA.demoJPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity(name = "users")     // Thông qua Entity để cho ORM biết đây là class đại diện trong database
@Table(name = "users") // Đại diện cho bảng User trong database
public class Users {

    @Id     // Chỉ định thuộc tính là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;

    // Bảng nào có khóa ngoại : sử dụng @ManyToOne và @JoinColumn

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
