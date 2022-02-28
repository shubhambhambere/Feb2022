package com.aspire.java.logicalprograms;
//***********
// *********
//  *******
//   *****
//    ***
//     *
//row=1-6,space=0-5,star=11-1
public class Star10 {public static void main(String[] args) {
	    for(int row=1;row<=6;row++)
	    {
	    	for(int space=2;space<=row;space++)
	    	{
	    		System.out.print(" ");
	    	}
	    	
	    	System.out.print("*");
	    	for(int star=5;star>=row;star--)
	    	{
	    		System.out.print("**");
	    	}
	    	
	    	System.out.println();
	    	
	    }
}

}
