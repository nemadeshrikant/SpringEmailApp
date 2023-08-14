package com.shrikant.sendmail.services;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.shrikant.sendmail.entity.StoreEmailRecordEntity;
import com.shrikant.sendmail.model.EmailRequest;
import com.shrikant.sendmail.model.EmailResponse;
import com.shrikant.sendmail.repository.StoreEmailRecordRepo;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;


@Service
public class EmailServiceImplementation implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	StoreEmailRecordRepo emailRecordRepo;

	@Override
	public EmailResponse sendMail(EmailRequest request) {
		// TODO Auto-generated method stub
		EmailResponse response = new EmailResponse();
		Utils utils = new Utils();
		try {

			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setTo(request.getRecipient());
			helper.setFrom(request.getFrom());
			helper.setSubject(request.getSubject());

			helper.setText(request.getMailBody(), true); // Set the second argument to true for HTML content
			

			javaMailSender.send(message);

			response.setErrorCode("0");
			response.setMessage("Email sent to " + request.getRecipient() + " successfully ");

		} catch (MailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setErrorCode("1");
			response.setMessage("Error Occured :  \n \n" + e.getLocalizedMessage());
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setErrorCode("1");
			response.setMessage("Error Occured :  \n \n" + e.getLocalizedMessage());
		} finally {

			StoreEmailRecordEntity entity = new StoreEmailRecordEntity(request.getRecipient(),request.getFrom(),
			request.getSubject(), request.getMailBody(), new Date(), utils.generateRef(),response.getMessage());
			
			emailRecordRepo.save(entity);//Save Email record into database.
		}
		
		return response;
	}

}
