package com.aspire.java.oops.accessmodifierDiff;

import com.aspire.java.oops.accessmodifier.Parent;
import com.aspire.java.oops.accessmodifier.Sample;

public class DiffChildClass extends Parent{

	public static void main(String[] args) {
		
		DiffChildClass cdc=new DiffChildClass();
		cdc.m1();  //public method from diff pack with inheritance w.r.t child class object
		cdc.m2(); //protected method from diff pack with inheritace w.r.t child class object
	
		
		
		Sample SDC=new Sample();
		SDC.m9(); //public method from diff pack w.r.t sample class object
		
		Parent PDC=new Parent();
		PDC.m1();  //public method from diff pack w.r.t Parent class object
		
		
		
		
		
		
		
	}
}
