package com.likith.sendemail.controller;

import com.likith.sendemail.model.EmailDetails;
import com.likith.sendemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendEmail(@RequestBody EmailDetails details) {
        String status = emailService.sendEmail(details);
        return status;
    }
    @PostMapping("/sendMailWithAttachment")
    public String sendEmailWithAttachment(@RequestBody EmailDetails details) {
        String status = emailService.sendEmailWithAttachment(details);
        return status;
    }
}
