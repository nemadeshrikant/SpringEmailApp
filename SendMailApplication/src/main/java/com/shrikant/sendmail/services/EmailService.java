package com.shrikant.sendmail.services;

import org.springframework.stereotype.Service;

import com.shrikant.sendmail.model.EmailRequest;
import com.shrikant.sendmail.model.EmailResponse;


@Service
public interface EmailService {

	EmailResponse sendMail(EmailRequest request);

}
