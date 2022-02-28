package com.aspire.java.oops.casting.primative;
// here we transfer the data from higher data type to lower data type
//when we transfer the data from higher data type to lower data type using casting then data loss happen
public class ExpliciteCasting {
	
	public static void main(String[] args) {
		double f=365331.4643;
		float e;
		long d;	
		int c;
		short b;		
		byte a;
		
		e=(float)f;
		d=(long)f;
		c=(int)f;
		b=(short)f;
		a=(byte)f;
		System.out.println(f);
		System.out.println("float e="+e);
		System.out.println("Long d="+d);
		System.out.println("int c="+c);	
		System.out.println("short b="+b);
		System.out.println("byte a="+a);
		
		
		
		
	}

}
