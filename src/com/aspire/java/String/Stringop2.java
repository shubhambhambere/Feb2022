package com.aspire.java.String;
// String Split & String replace
public class Stringop2 {
	public static void main(String[] args) {
	
		String s1="Aspire";
		String s2="Aspire Training Institute Pune";
		String s3="";
		
		
		String[] a=s2.split("");
		System.out.println(s2.replace("Training","training"));
		System.out.println(s2.replace("Training Institute", "coaching institute"));
	
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			
		}
		System.out.println();
		
		for(int j=a.length-1;j>=0;j--)   //reverse String 
		{
			System.out.print(a[j]);
		}
		
		
		
	}

}
