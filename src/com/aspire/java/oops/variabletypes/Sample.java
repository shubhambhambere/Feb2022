package com.aspire.java.oops.variabletypes;

public class Sample {
	int a=10;               //Global non  static Variable
	static int b=50;       //Global static Variable
     String s="shubham ayesha";
     
     public void addition()
     {int d=20;         //Local Variable
    	 int c;
    	 c=a+b+d;
    	 System.out.println(c);
    	 System.out.println(s);
     }
     public void subtraction()
     {
    	 int e=20;   //local variable
    	 int f=b-a-e;
    	 System.out.println(f);
    	 System.out.println(s);
     }
     public static void Multi()
     { int f=50;
     int g=f*b;
     System.out.println(g);
    
     }
     
	
}
