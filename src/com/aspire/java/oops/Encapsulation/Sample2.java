package com.aspire.java.oops.Encapsulation;

public class Sample2 extends Sample1
{
   private int i=20;
   private int j=3;
   int k=2;
   public void Multi()
   {
	   int l=i*j*k*c;
	   System.out.println(l);
	   
	   Sample1 s=new Sample1();
	   int z=i*j*k*s.c;
	   System.out.println("z="+z);
			


   }
	
}
