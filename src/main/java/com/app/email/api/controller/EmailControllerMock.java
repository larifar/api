package com.app.email.api.controller;

import com.app.email.api.model.Email;
import com.app.email.api.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class EmailControllerMock {
    @Autowired
    EmailService service;


    @GetMapping("/getEmails")
    public ResponseEntity<List<Email>> getAll(){
        return new ResponseEntity<>(service.getAllEmails(), HttpStatus.OK);
    }

    @GetMapping("/getEmails/{id}")
    public ResponseEntity<Email> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getEmail(id), HttpStatus.OK);
    }

    @PostMapping("/send")
    public ResponseEntity<Email> sendEmail(@RequestBody Email email){
        if (email == null) {
            throw new RuntimeException("Email não pode ser nulo.");
        }
        return new ResponseEntity<>(service.sendEmail(email), HttpStatus.ACCEPTED);
    }
}
