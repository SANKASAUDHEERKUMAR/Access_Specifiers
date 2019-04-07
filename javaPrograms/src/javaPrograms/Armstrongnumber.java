package javaPrograms;

import java.util.Scanner;

public class Armstrongnumber {

	public static void isarmstrong(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int cube=0;
		int r,t;
		t=num;
		while(num>0){
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube){
			System.out.println("Given Number is Armstrong Number");
		}
		else{
			System.out.println("Given Number is not Armstrong Number");
		}
		
	}
	public static void main(String[] args) {
		isarmstrong();
	}

}
