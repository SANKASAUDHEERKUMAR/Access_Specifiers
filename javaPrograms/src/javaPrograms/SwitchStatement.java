package javaPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		SwitchStatement.ssk();
	}
		public static void ssk(){
		try{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter any value  :   ");
			int a=s.nextInt();
			switch(a){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("default case");
		}
		}
		
		catch(InputMismatchException i){
			
			System.out.println("input wrong");
			SwitchStatement.ssk();
			
		}
	}
}
