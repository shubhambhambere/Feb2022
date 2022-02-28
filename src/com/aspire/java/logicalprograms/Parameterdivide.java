package com.aspire.java.logicalprograms;

import java.util.Scanner;

public class Parameterdivide {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("plz enter the three values");
	div(scan.nextInt(),scan.nextInt(),scan.nextInt());
}
public static void div(int a,int b, int c)
{
	float d=a/b/c;
	System.out.println(d);
}
}
