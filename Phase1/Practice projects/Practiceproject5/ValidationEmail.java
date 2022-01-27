package Practiceproject5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


public class ValidationEmail {
	
	

		    public static boolean isValid(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                              
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }
	  
	    public static void main(String[] args)
	    {
	        ArrayList<String> address = new ArrayList<>();
	            
	          address.add("vijaynamala4346@gmail.com");
	          address.add("vijaynamalagmail.com");
	            
	        for(String i : address){
	            if (isValid(i))
	                System.out.println(i + " - true");
	            else
	                System.out.println(i + " - flase");
	        }
	    }

	{
		
	}
	}
