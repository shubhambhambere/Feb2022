package com.aspire.java.arrays;

import java.util.Arrays;

// We are use the arrays For collection Of Same type of Info
public class OneDimensional {

	public static void main(String[] args) {
		 int [] a= {1,2,3,4,5,6,7,8};     //Size & length of arrays (elements Present in array)
		 int b[]= {11,12,13};
		 int []c= {20,21,22,23,24};
	     char []z= {'A','B','C','D'};
	     String []x= {"shubham","Ayesha","Made for each Other"};
	     
		 int[] d=new int[6];
		 d[0]=5;
		 d[1]=6;
		 d[2]=7;
		 d[3]=8;
		 d[4]=9;
		 d[5]=10;
		 
		 
		 System.out.println("lenghth of d[]= "+d.length);
		 System.out.println("2nd index of b[]="+b[1]);
		 int sum=a[5]+b[2];
		 System.out.println("Addition of a[5]+b[2]="+sum);
		 for(int e=0;e<a.length;e++)
		 {
			 System.out.print(a[e]+" ");
		 }
		 System.out.println();
		 for(int f=0;f<b.length;f++)
		 {System.out.print(b[f]+" ");	 
		 }
		 System.out.println();
		 for(int g=0;g<x.length;g++)
		 {System.out.print(x[g]+" ");
			 
		 }
		 System.out.println();
		 int []h= {5460,5,1,65,64,2,57,522,14};
		 System.out.println("Sorting h[] ");
		 Arrays.sort(h);
		 for(int i=0;i<h.length;i++)
		 {
			 System.out.print(h[i]+" ");
		 }
		 System.out.println();
		 System.out.println("Sorting h[] reverse");
		 for(int j=h.length-1;j>=0;j--)
		 {
			 System.out.print(h[j]+" ");
		 }
		 
	}	
	}
