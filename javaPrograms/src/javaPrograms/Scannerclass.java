package javaPrograms;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID:");
		int id= sc.nextInt();
		System.out.println("Enter String:");
		String st=sc.next();
		System.out.println("Enter byte:");
		byte by=sc.nextByte();
		System.out.println("Enter float");
		float f=sc.nextFloat();
		System.out.println("Enter Long");
		long l=sc.nextLong();
		System.out.println("Enter Double");
		double DB=sc.nextDouble();
		System.out.println("-----------------------------------");
		
		System.out.println("id= "+id);
		System.out.println("String= "+st);
		System.out.println("byte= "+by);
		System.out.println("float= "+f);
		System.out.println("Long= "+l);
		System.out.println("Double= "+DB);
		
		
	}
}
