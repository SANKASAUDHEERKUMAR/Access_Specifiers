package javaPrograms;

import java.util.Scanner;

public class palindrome {

	static String org,Rev="";
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		org=sc.nextLine();
		int l=org.length();
		for(int i=l-1;i>=0;i--){
			Rev=Rev+org.charAt(i);
		}
			if(org.equals(Rev)){
				System.out.println("Given String is Palindrom");
			}
			else{
				System.out.println("Given String is not Palindrom");
			}
		}
		
	}

