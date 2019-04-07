package com.anotherpackage;

import com.samepackage.*;

public class ClassD extends ClassA{

	ClassD()
	{
	//System.out.println(pri);
	//	System.out.println(def);
		System.out.println(pro);
		System.out.println(pub);
		
	}
	
	void check()
	{
		//System.out.println(pri);
		//	System.out.println(def);
			System.out.println(pro);
			System.out.println(pub);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassD cD=new ClassD();
	//	System.out.println(cD.pri);
	//	System.out.println(cD.def);
		System.out.println(cD.pro);
		System.out.println(cD.pub);
		
		

	}

}
