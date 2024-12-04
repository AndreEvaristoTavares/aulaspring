package com.dev.aulaspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.aulaspring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "andre", "ande@gmail.com", "1199999-9999", "1234");
        return ResponseEntity.ok().body(user);
    }
}
