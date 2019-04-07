package java_programs_interview;

/*Write a Java Program to reverse a string without using String inbuilt function reverse().*/
public class reversestring_woreverse {

		public static void main(String[] args) {
			String str = "Saket Saurav";
			char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
			for(int i= chars.length-1; i>=0; i--) {
				System.out.print(chars[i]);
			}
		}
	}


/*
 //Method-2:
	import java.util.Scanner;

	public class ReverseSplit {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your String");
			str = in.nextLine();
			String[] token = str.split("");    //used split method to print in reverse order
			for(int i=token.length-1; i>=0; i--)
			{
				System.out.print(token[i] + "");
			}
			
		}

	}*/

/*
      //Method-3:
	import java.util.Scanner;

	public class Reverse {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String original, reverse = "";
			System.out.println("Enter the string to be reversed");
			Scanner in = new Scanner(System.in);
			original = in.nextLine();
			int length = original.length();
			for(int i=length-1; i>=0; i--) {
				reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
			}
			System.out.println(reverse);
		}

	}
*/