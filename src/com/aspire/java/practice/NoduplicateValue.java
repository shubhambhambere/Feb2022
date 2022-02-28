package com.aspire.java.practice;

import java.util.TreeSet;

public class NoduplicateValue 
{
public static void main(String[] args) {
	
	
	int a[]= {1,2,3,4,5,2,6};
	
    TreeSet	tr=new TreeSet();
 
    for(int b:a)
    {
        tr.add(b);
        
    }
	System.out.println(tr);
	
	
//	String b="Shubham123456";
//	String []s=b.split("");
//	for(int i=s.length-1;i>=0;i--)
//	{
//		System.out.print(s[i]);
//	}
//	System.out.println();
//	String []z=b.split("2");
//	for(String z1:z)
//	{
//		System.out.println(z1);
//	}
//	
}
}
