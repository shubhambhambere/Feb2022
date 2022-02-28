package com.aspire.java.logicalprograms;
//    ***
//   *****
//  *******
// *********
//***********
//row=1-6,star=1-11,space=5-0
public class Star8 {public static void main(String[] args) {
	for(int row=1;row<=6;row++)
	{
		for(int space=5;space>=row;space--)
		{
			System.out.print(" ");
			
		}
		
		for(int star=0;star<=row-2;star++)
		{
		
			System.out.print("**");
		}
		System.out.print("*");
		
		System.out.println();
	}
}

}
