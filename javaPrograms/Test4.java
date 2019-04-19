package Collections;

import java.util.ArrayList;

public class Test4 {

	public static void main(String args[]){
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("E");
		al.add("D");
		al.add("F");
		System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add("B");
		al1.add("C");
		al1.add("D");
		al1.add("F");
		System.out.println(al1);
		System.out.println(al.removeAll(al1));
		System.out.println(al);
		System.out.println(al.removeAll(al1));
		System.out.println(al);
		
	}
}
