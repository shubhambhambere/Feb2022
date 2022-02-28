package com.aspire.java.practice;

import java.util.TreeSet;

public class Practice3
{
public static void main(String[] args) {
	
	int []a= {1,2,5,6,4,5,9};
	String []s= {"Shubham","Aniket","Dhananjay"};
	TreeSet tr =new TreeSet();
	for(int i=0;i<=a.length-1;i++)
	{
		tr.add(i);
		
	}
	for(int j=0;j<=s.length-1;j++)
	{
		tr.add(s[j]);
	}
	System.out.println(tr);
	
	
	
}
}
