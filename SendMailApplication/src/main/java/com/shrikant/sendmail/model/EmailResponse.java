package com.shrikant.sendmail.model;

public class EmailResponse {

 private String errorCode;
 private String message;


public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}



 

}
