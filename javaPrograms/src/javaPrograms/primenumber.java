package javaPrograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String args[]) {

		int p;
		//boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anu number to find prime number or not");
		int num = sc.nextInt();

		for (int i = 2; i <= num; i++) 
		{
            p=0;            
			for (int j = 2; j < i; j++)
			{
				System.out.println("j value is: "+j);
				if (i % j == 0)
				{
					p = 1;
					break;
				}
			}

			if (p == 0) 
			{
				System.out.println(i);
			}
		}
	}
}