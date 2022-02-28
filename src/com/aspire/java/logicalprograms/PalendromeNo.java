package com.aspire.java.logicalprograms;

public class PalendromeNo {

	public static void main(String[] args) {
		
		int num=121;
		int rev=0;
		int rem=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
			
		}
		if(temp==rev)
		{System.out.println("This No is Palendrome="+temp);
			
		}
		else
		{
			System.out.println("This No is NOT Palendrome="+temp);
		}
			
			
			
		
	}
	
}
