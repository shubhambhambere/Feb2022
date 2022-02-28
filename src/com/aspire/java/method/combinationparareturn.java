package com.aspire.java.method;

public class combinationparareturn {
public static void main(String[] args) {
	int d=method1(10,20);
	System.out.println(d);
	combinationparareturn object=new combinationparareturn();
//	System.out.println(object.method2(10, 50));
    int source = object.method2(20, 50);
	System.out.println(source);	
}

public static int method1(int a,int b)
{
	int c=a+b;
	return c;
}
public  int method2(int x,int y)
{
    int z=x+y;
    return z;
}
}
