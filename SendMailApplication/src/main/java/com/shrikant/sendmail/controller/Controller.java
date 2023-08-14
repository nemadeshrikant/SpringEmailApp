package com.shrikant.sendmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shrikant.sendmail.model.EmailRequest;
import com.shrikant.sendmail.model.EmailResponse;
import com.shrikant.sendmail.services.EmailService;

@RestController
@RequestMapping("/shrikant")
public class Controller {

	@Autowired
	EmailService emailService;

	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST, produces = { "application/json" }, consumes = {
	"application/json" })
	public ResponseEntity<EmailResponse> sendmail(@RequestBody EmailRequest request) {

		System.out.println("data--------- " + request.toString());
		EmailResponse result = null;
		try {
			if (request != null) {

				result = emailService.sendMail(request);

				System.out.println("result :  =====  " + result.toString());
			} else {
				result.setErrorCode("1");
				result.setMessage("please provide valid request");
			}
		} catch (Exception e) {
			System.out.println("Exception : " + e.getLocalizedMessage());
			result.setErrorCode("1");
			result.setMessage("Exception : " + e.getLocalizedMessage());
		}
		return new ResponseEntity<EmailResponse>(result, HttpStatus.OK);
	}
}
