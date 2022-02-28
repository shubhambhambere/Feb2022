package com.aspire.java.logicalprograms;
//153----->1*1*1+5*5*5+3*3*3
public class ArmStrong
{
public static void main(String[] args) {
	int num=407;
	int rem=0;
	int sum=0;
	int temp=num;
	while(num>0)
	{
		rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
		
	}
	if(temp==sum)
	{
		System.out.println("This is Armstrong Number="+temp);
	}
	else
	{
		System.out.println("This Is NOT ArmStrong Number="+temp);
	}
	
}
	
}
