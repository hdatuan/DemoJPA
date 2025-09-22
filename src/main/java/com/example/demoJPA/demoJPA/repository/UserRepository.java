package com.example.demoJPA.demoJPA.repository;

import com.example.demoJPA.demoJPA.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findByEmailAndPassword(String email, String password);

    // Viet query bang cu phap cua JPA
    @Query("SELECT u FROM users u WHERE u.email = :name AND u.password = :password")
    Optional<Users> getUserByEmailAndPassword(@Param("name") String email,
                                              @Param("password") String password);

}
