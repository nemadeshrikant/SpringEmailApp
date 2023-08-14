package com.shrikant.sendmail.model;

import java.util.Date;

public class EmailRequest {

	
	private String recipient;
	private String from;
	private String subject;
	private String mailBody;
	public EmailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailRequest(String recipient, String from, String subject, String mailBody) {
		super();
		this.recipient = recipient;
		this.from = from;
		this.subject = subject;
		this.mailBody = mailBody;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMailBody() {
		return mailBody;
	}
	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}
	@Override
	public String toString() {
		return "EmailRequest [recipient=" + recipient + ", from=" + from + ", subject=" + subject + ", mailBody="
				+ mailBody + "]";
	}
	
	

			
	
	
}
