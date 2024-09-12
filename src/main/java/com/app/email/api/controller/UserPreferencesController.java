package com.app.email.api.controller;

import com.app.email.api.model.UserPreferences;
import com.app.email.api.service.UserPreferencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserPreferencesController {
    @Autowired
    UserPreferencesService service;

    @GetMapping("/getPreferences/{id}")
    public ResponseEntity<UserPreferences> getPreference(@PathVariable Long id){
        return new ResponseEntity<>(service.get(id), HttpStatus.OK);
    }

    @PostMapping("/savePreference")
    public ResponseEntity<UserPreferences> save(@RequestBody UserPreferences userPreferences){
        return new ResponseEntity<>(service.save(userPreferences), HttpStatus.CREATED);
    }
}
