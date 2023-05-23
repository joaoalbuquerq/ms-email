package com.mail.api.service;

import com.mail.api.model.Email;
import com.mail.api.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepository repository;

    public void sendEmail(Email email) {



    }
}
