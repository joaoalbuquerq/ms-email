package com.mail.api.controller;

import com.mail.api.dto.EmailDTO;
import com.mail.api.model.Email;
import com.mail.api.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService service;

    @PostMapping("/send-email")
    public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDTO dto){

        Email email = new Email();
        BeanUtils.copyProperties(dto, email);
        service.sendEmail(email);
        return new ResponseEntity<>(email, HttpStatus.CREATED);
    }

}
