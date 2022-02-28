package com.aspire.java.practice;

public class Child extends Parent
{
     int a=100;  
public  void M1()
{   int a=10;
	//System.out.println("local value="+a);
//	System.out.println("Global from parent="+super.a);
//	System.out.println("golbal from same class="+this.a);
//    System.out.println(Child.z);
//  System.out.println(z);
  //  System.out.println(this.a);
	
//	System.out.println(a);
//	System.out.println(super.a);
//	System.out.println(this.a);
}

public static void main(String[] args) 
{
	
	Child c = new Child();
	c.M1();
//	System.out.println(c.a);
	
//	System.out.println(Child.z);
//	System.out.println(z);
	
	
	
}

}
