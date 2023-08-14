package com.shrikant.sendmail.services;

import java.util.Random;

public class Utils {

	public static String generateRef() {  
	    String numbers = "0123456789";  
	    Random rndm_method = new Random();  
	    char[] ref = new char[6];  
	    for (int i = 0; i < 6; i++) {  
	        ref[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));  
	    }  
	    return new String(ref);  
	}  
}
