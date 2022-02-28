package com.aspire.java.oops.Interface1;

abstract public class Redmi implements Mobile {


	public void Camera() {

	System.out.println("Redmi camera 50 MP");	
	}


	public void SelfieCamera() {
		System.out.println("Redmi Selficamera 10 MP");
		
	}

	public void Display() {
		System.out.println("Redmi Display 10inch");
		
	}

	public void Os() {
		System.out.println("Redmi Operating Software Oracle");
		
	}
	abstract public void RAM();   //Unique method from redmi extends in test class
	

}
