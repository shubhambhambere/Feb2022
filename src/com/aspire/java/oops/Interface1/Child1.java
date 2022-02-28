package com.aspire.java.oops.Interface1;

 public class Child1 implements Inter_face1,Inter_face2{

	
//abstract public void m1();  //incomplete method its defination provide in grandchild class 

	
	public void m3() {
		System.out.println("Running from child1 nonstatic m3");
		
	}

	public void m4() {
		System.out.println("Running from child1 nonstatic m4");
	}


	public void m5() {
		System.out.println("Running from child1 nonstatic m5");
		
	}


	public void m6() {
		System.out.println("Running from child1 nonstatic m6");
	}


	
	public void m7() {
	
		System.out.println("Running from child1 nonstatic m7");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
