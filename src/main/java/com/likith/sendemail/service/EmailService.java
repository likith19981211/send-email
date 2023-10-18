package com.likith.sendemail.service;

import com.likith.sendemail.model.EmailDetails;

public interface EmailService {

    String sendEmail(EmailDetails details);

    String sendEmailWithAttachment(EmailDetails details);
}
