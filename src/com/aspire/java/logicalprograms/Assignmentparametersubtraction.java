package com.aspire.java.logicalprograms;
//take input from user and make subtraction
import java.util.*; 
public class Assignmentparametersubtraction {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 subtraction(50,20,10);
	 System.out.println("plz enter three values");
	 subtraction(scan.nextInt(),scan.nextInt(),scan.nextInt());
	
}
public static void subtraction(int a,int b,int c)
{
	int d=a-b-c;
	System.out.println(d);
}

}
