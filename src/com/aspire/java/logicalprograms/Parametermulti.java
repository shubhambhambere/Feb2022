package com.aspire.java.logicalprograms;

import java.util.Scanner;

public class Parametermulti {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Plz enter The six values");
multi(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());	
}
public static void multi(int a,int b,int c,int d,int e,int f)
{
	int g=a*b*c*d*e*f;
	System.out.println(g);
}
}
