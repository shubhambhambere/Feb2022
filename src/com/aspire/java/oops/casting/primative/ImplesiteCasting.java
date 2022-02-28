package com.aspire.java.oops.casting.primative;
// here we give the lower data type value to higher data type value
// Here the more space consume
public class ImplesiteCasting {
	
	public static void main(String[] args) {
		
		byte a=10;
		short b;
		int d;
		long e;
		float f;
		double g;
		
		System.out.println(a);
		b=a;
		d=b;
		e=a;
		f=a;
		g=a;		
		System.out.println("short b="+b);
		System.out.println("int d="+d);
		System.out.println("long e="+e);
		System.out.println("float f="+f);
		System.out.println("douoble g="+g);
		
	}

}
