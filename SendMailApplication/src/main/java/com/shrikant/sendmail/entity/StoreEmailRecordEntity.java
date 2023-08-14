package com.shrikant.sendmail.entity;

import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreEmailRecordEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "RECIPIENT")
	private String recipient;

	@Column(name = "MAILFROM")
	private String mailFrom;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "MAILBODY",columnDefinition = "TEXT")
	private String mailBody;

	@Column(name = "DATE")
	private Date date;

	@Column(name = "REFERENCE")
	private String reference;
	
	@Column(name = "RESPONSE")
	private String response;



	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public StoreEmailRecordEntity(String recipient, String mailFrom, String subject, String mailBody, Date date,
			String reference, String response) {
		super();
		this.recipient = recipient;
		this.mailFrom = mailFrom;
		this.subject = subject;
		this.mailBody = mailBody;
		this.date = date;
		this.reference = reference;
		this.response = response;
	}

	public StoreEmailRecordEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "StoreEmailRecordEntity [recipient=" + recipient + ", mailFrom=" + mailFrom + ", subject=" + subject
				+ ", mailBody=" + mailBody + ", date=" + date + ", reference=" + reference + ", response=" + response
				+ "]";
	}

}
