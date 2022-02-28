package com.aspire.java.logicalprograms;
//* * * * * *
// * * * * * 
//  * * * * 
//   * * * 
//    * *
//     *
//space=0-5,row=1-6,star=6-1

public class Star9 {public static void main(String[] args) {
	        for(int row=1;row<=6;row++)
	        {
	        
	        	for(int space=1;space<=row;space++)
	        	{
	        		System.out.print(" ");
	        		
	        	}
	        	for(int star=6;star>=row;star--)
	        	{
	        		
	        		System.out.print("*"+" ");
	        	}
	        	
	        	System.out.println();
	        }
}

}
