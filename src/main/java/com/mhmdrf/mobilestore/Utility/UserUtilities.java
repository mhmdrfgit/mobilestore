package com.mhmdrf.mobilestore.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class UserUtilities {

	public Boolean emailAuthentication(String emailId) {
		//Regular Expression   
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+"
        		+ "/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
        
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);
        
        //matching the emailid with the regex pattern
        Matcher matcher = pattern.matcher(emailId);
        
        return matcher.matches();
	}
}
