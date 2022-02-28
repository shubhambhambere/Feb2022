package com.aspire.java.oops.polymorphism.Overriding;

public class Test1 {
public static void main(String[]args)
{
	OverRidingParent1 op=new OverRidingParent1();
	op.Banglow();
	op.Farm();
	op.money();
	op.car();     //Unique method From Parent
	op.daughterinlaw();
	op.Addition(10,30);
    
	OverRidingParent1.Jwellery();
	
	
	OverRidingChild1 oc=new OverRidingChild1();
	oc.Banglow();
	oc.Farm();
	oc.money();
	oc.car();     //Unique method From parent Class
	oc.Bike();  //Unique method From Child Class
    oc.Addition(10, 40);
	OverRidingChild1.Jwellery();
}
}
