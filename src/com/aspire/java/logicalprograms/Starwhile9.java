package com.aspire.java.logicalprograms;
//     *
//    * * 
//   * * * 
//  * * * * 
// * * * * *
//* * * * * *
//row=1-6,star=1-6,space=5-0
public class Starwhile9 {
          public static void main(String[] args) {
			int row=1;
			while(row<=6)
			{
				int space=5;
				while(space>=row)
				{
					System.out.print(" ");
					space--;
				}
				int star=1;
				while(star<=row)
				{
					System.out.print("*"+" ");
					star++;
				}
				
				row++;
				System.out.println();
			}
		}
}
