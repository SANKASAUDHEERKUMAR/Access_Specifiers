package javaPrograms;

import java.util.Scanner;
// method overriding and 
class commertial {

	private String name;
	void setname(String name){
		this.name=name;
		/*Scanner sc=new Scanner(System.in);
		String name=sc.next();*/
	}
	String getname(){
		//System.out.println(name);
		return name;
	}
	void bill(int units){
		System.out.println("Customer name:"+getname());
		System.out.println("Bill Amount:"+units*5.00);
	}
}
class Domestic extends commertial{
	void bill(int Units){
		System.out.println("Customer name:"+getname());
		System.out.println("Bill Amount:"+Units*2.50);
	}
}
public class Ebill{
	public static void main(String args[]){
		commertial c=new commertial();
				c.setname("Sudheer");
				c.getname();
				c.bill(300);
		Domestic d=new Domestic();
		d.setname("Sudheer");
		c.getname();
		d.bill(300);
	}
}
