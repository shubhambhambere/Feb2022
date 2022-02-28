package com.aspire.java.practice;

public class ArrayDuplicate 
{
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,6,8,4,8,7,6,2};
	int count=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{System.out.println("Duplicate Value="+a[i]);
				count++;
			}
			
			
			
		}
		
		
	}
	
	System.out.println("Total duplicate Value="+count);
	
}
}
