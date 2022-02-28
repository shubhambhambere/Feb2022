package com.aspire.java.logicalprograms;

import java.util.Scanner;

public class Divisibleby7 {
public static void main(String[] args) {
	int a;
	Scanner object=new Scanner(System.in);
	System.out.println("Plz enter value");
	a=object.nextInt();
	
	

    if(a%7==0)
    {
    	System.out.println("Number divisible by "+a);
    }
    else
    {
    	System.out.println("Number is not divisible by 7");
    }
}
}
