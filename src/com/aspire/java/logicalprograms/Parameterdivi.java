package com.aspire.java.logicalprograms;

import java.util.Scanner;

//divisible by 7 from user input range
public class Parameterdivi {
public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("enter value");
	for(int i=scan.nextInt();i<=100;i++)
	{
		if(i%7==0&&i%5==0)
		{
			System.out.println(i);
		}
	}
	
 
	
}
}
