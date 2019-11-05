package com.github.sccoptionalbug.controllers;


import com.github.sccoptionalbug.domain.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping()
    public ResponseEntity<Void> createUser(@Valid @RequestBody UserDto user) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
