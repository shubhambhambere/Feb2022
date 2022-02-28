package com.aspire.java.oops.remaininheritance;

public class HerarchicalHDFC extends HerachicalRBI {

	public void HDFC()
	{
		System.out.println("HDFC is national bank ");
	}
	public void HDFCrules()
	{
		System.out.println("HDFC Having Rules to Open a New Bank");
	}
	
	public void HDFCrulesAccount()
	{
		System.out.println("HDFC Having Rules to Open a New Bank Account");
	}
	
	public static void main(String[]args)
	{
		//SBI New Bank open process
		System.out.println("********SBI Bank Opening process*******");
		HerarchicalSBI HS=new HerarchicalSBI();
		HS.RBI();
		HS.RBIRules();
		HS.Sbi();
		HS.sbirules();
		HS.sbirulesAccount();
		
		System.out.println("********AXIS Bank Opening process*******");
		HerarchiclAxis HA=new HerarchiclAxis();
		HA.RBI();
		HA.RBIRules();
		HA.Axis();
		HA.Axisrules();
		HA.AxisrulesAccount();
		
		System.out.println("********HDFC Bank Opening Process********");
		HerarchicalHDFC HDFC=new HerarchicalHDFC();
		HDFC.RBI();
		HDFC.RBIRules();
		HDFC.HDFC();
		HDFC.HDFCrules();
		HDFC.HDFCrulesAccount();
		
		
	}
	
	
	}
	

