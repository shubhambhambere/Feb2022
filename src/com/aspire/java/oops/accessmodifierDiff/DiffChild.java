package com.aspire.java.oops.accessmodifierDiff;

import com.aspire.java.oops.accessmodifier.SubClass;
import com.aspire.java.oops.accessmodifier.Superclass;


public class DiffChild extends SubClass{

	public static void main(String[] args) {
		
		DiffChild dcc=new DiffChild();
		dcc.a1(); //public from Diff pack by inheritance W.r.t Parent class
		dcc.a2();  //protected from Diff pack by inheritance W.r.t Parent class
		dcc.a5();   //public from Diff pack by inheritance W.r.t Parent class
		dcc.a6();   //protected from Diff pack by inheritance W.r.t Parent class
		
		Superclass Sc=new Superclass();
		Sc.a1();
		
		SubClass sub=new SubClass();
		sub.a1();
		sub.a5();
		
	}
	
}
