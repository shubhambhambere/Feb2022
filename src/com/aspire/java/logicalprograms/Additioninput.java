package com.aspire.java.logicalprograms;

import java.util.Scanner;

public class Additioninput {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	addition(10,20,30);
	addition(20,50,60);
	System.out.println("Enter the Three values Below ");
	addition(scan.nextInt(),scan.nextInt(),scan.nextInt());
	
}
public static void addition(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println(d);
	
}
}
