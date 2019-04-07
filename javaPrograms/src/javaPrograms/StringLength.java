package javaPrograms;

/* string length without using Lemgth()*/
public class StringLength {
	   public static void main(String args[]) throws Exception {
	      String str = "sampleString";
	      int i = 0;
	      for(char c: str.toCharArray()) {
	         i++;
	      }
	      System.out.println("Length of the given string ::"+i);
	   }
	}

/* 
 // using length()
 public class LengthExample{  
 
public static void main(String args[]){  
String s1="javatpoint";  
String s2="python";  
System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
System.out.println("string length is: "+s2.length());//6 is the length of python string  
}}  
*/