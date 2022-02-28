package com.aspire.java.logicalprograms;

import java.util.Scanner;

//taking input from user
public class Inputatm {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
			System.out.println("Enter Your Password");
 int pwd=scan.nextInt();
 System.out.println("Enter Your Amount");
	int amount=scan.nextInt();
	System.out.println("password is: "+pwd);
	System.out.println("Amount is :"+amount);
}

}
