package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }
    
    @PostMapping("/login") 
    public ResponseEntity<?> loginUser(@RequestBody User loginRequest) {
    	User user = userService.getUserByEmail(loginRequest.getEmail());
    	if (user != null && user.getPassword().equals(loginRequest.getPassword())) { 
    		return ResponseEntity.ok(user); 
    		} else { 
    			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
    			} 
    	}
}
