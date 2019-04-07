package javaPrograms;

public class char2arr {

	public static void main(String[] args) {
		char arr[]={'s','u','d','h','e','e','r'};
		String s=new String(arr);
		System.out.println(s);
		
		String s1=new String(arr,2,5);
		System.out.println(s1);

	}

}
