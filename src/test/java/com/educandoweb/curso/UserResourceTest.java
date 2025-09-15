package com.educandoweb.curso;

import com.educandoweb.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;
@RestController
@RequestMapping(value= "/users")
class UserResourceTest {
@GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User (1L,"Maria", "Maria@email.com", "14524");
        return ResponseEntity.ok().body(u);
    }
}

