package javaPrograms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p = 0;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anu number to find prime number or not");
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				System.out.println("Not Prime");
				p = 1;

			}

		}

		if (p == 0)
			System.out.println("Prime");

	}
}
