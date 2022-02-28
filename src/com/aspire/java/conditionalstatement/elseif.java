package com.aspire.java.conditionalstatement;

public class elseif {public static void main(String[] args) {
	//if else if
	System.out.println("Program Start");
	int marks=45;
      	if (marks>100)
	     {
	    	System.out.println("Plz reenter the Marks Its Invalid");
	     }
	    else if(marks>=75)
	    {
		System.out.println("Pass With Distinction");
	    }
	    else if(marks>=60)
	    {
	    	System.out.println("Pass with first class");
	    }
	    else if(marks>=40)
	    {
	    	System.out.println("pass with second class");
	    }
	    else
	    {
	    	System.out.println("fail");
	    }
      	System.out.println("Program End");
	
}

}
