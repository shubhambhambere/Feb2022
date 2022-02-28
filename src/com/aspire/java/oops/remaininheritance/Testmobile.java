package com.aspire.java.oops.remaininheritance;

public class Testmobile {public static void main(String[] args) {
	
	MobileParent MP=new MobileParent();
	MP.Specification();
	MP.Features();
	MobileParent.mobile();
	
	TwoGMobileChilod TG=new TwoGMobileChilod();
	TG.Features();
	TG.Specification();
	TwoGMobileChilod.G2Features(10, 20,40);
	TG.G2();
	MobileParent.mobile();
	
	ThreeGMobileChild THG=new ThreeGMobileChild();
	THG.Features();
	THG.G2();
	THG.G3();
	THG.Specification();
	ThreeGMobileChild.G3Features(20, 30, 50);
	
	FourGMobilechild FG=new FourGMobilechild();
	FG.Features();
	FG.G2();
	FG.G3();
	FG.G4();
	FG.Specification();
	FourGMobilechild.G4Features();
	
	
}

}
