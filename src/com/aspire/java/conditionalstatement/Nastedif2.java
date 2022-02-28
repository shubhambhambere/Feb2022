package com.aspire.java.conditionalstatement;

//login to system
//user name,password

public class Nastedif2 {public static void main(String[] args) {
	System.out.println("plz enter user name:");
	String UN="Shubham";
	String PWD="Shubh@99";
	String OTP="1234";
	if(UN=="Shubham")
	{System.out.println("User name Is Correct");
	    
	    if(PWD=="Shubh@99")
	    {System.out.println("Password is correct");
	    	
	    }
	    else
	    {System.out.println("Password is incorrect");
	    	
	    }
	    if(OTP=="1234")
	    {System.out.println("OTP Is Correct");
	    	
	    }
	    else
	    {System.out.println("OTP Is incorrect");
	    	
	    }
	    
	}
	else
	{System.out.println("User name Is incorrect");
		
	}
	
}

}
