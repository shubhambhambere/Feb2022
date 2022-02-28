package com.aspire.java.oops.polymorphism.Overriding;

public class Test2 {
	public static void main(String[]args)
	{
		OverRidingParent2 op=new OverRidingParent2();
		op.bnglow();
		op.farm();
		op.jwellery();
		op.money();
		OverRidingParent2.buisness();
		OverRidingParent2.main();
		
		
		OverRidingchild2 oc=new OverRidingchild2();
		System.out.println("********************");
		oc.bnglow();
		oc.farm();
		oc.jwellery();
		oc.money();
		OverRidingchild2.buisness();
		OverRidingParent2.main();
	}
	

}
