package com.aspire.java.logicalprograms;
//*****
//****  
//***    
//**      
//*       
//*        
//**      
//***    
//****  
//*****
//row1=1-5,star1=5-1
//row2=1-5,star2=1-5
public class star7 {public static void main(String[] args) {
	for(int row1=1;row1<=5;row1++)
	{
		for(int star1=5;star1>=row1;star1--)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	for(int row2=1;row2<=5;row2++)
	{
		for(int star2=1;star2<=row2;star2++)
		{
			
			System.out.print("*");
		}
		
		System.out.println();
	}

	
	
}

}
