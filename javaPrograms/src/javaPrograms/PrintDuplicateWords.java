package javaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PrintDuplicateWords {

	// Print Duplicate Word in the String
	static void Duplicate_Word(){
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		HashMap<String,Integer> hm=new HashMap<>();
		String[] ST=S.split(" ");
		for(String Duplicate:ST){
			//System.out.println(Duplicate); //Print all the words 
			if(hm.get(Duplicate)!=null){
				hm.put(Duplicate, hm.get(Duplicate)+1);
			}
			else{
			hm.put(Duplicate, 1); // Printed like this ---i am am learning java in java T point using java book {using=1, java=1, T=1, in=1, book=1, i=1, learning=1, am=1, point=1}
			}
		}
		Iterator<String> Duplicate=hm.keySet().iterator();
		while(Duplicate.hasNext()){
			String temp=Duplicate.next();
			if(hm.get(temp)>1){
				System.out.println("the Word "+temp+" Appeared "+hm.get(temp)+" no of times ");
			}
		}
		
	}
	
	// Print Duplicate Characters in the String
	static void Duplicate_Character(String str){
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(hm.get(c)!=null){
				hm.put(c,hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}
		System.out.println(hm);
	}
	
	
	public static void main(String[] args) {
		
		Duplicate_Word();
		System.out.println("-------------------------------------");
		Duplicate_Character("Scanner sc=new Scanner(System.in);String S=sc.nextLine();");
	}

}
