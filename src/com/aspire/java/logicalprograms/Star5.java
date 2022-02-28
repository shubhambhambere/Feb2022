package com.aspire.java.logicalprograms;
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
//row=1-6 ,star=1-6,space=5-0
public class Star5 {public static void main(String[] args) {
	for(int row=1;row<=6;row++)
	{
		for(int space=5;space>=row;space--)
		
		{
			System.out.print(" ");
		}
		for(int star=1;star<=row;star++)
		{
			System.out.print("*"+" ");
		}
	    System.out.println();
	}
}

}
