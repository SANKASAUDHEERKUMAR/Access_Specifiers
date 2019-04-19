package Collections;

import java.util.HashSet;

/* public boolean remove(object obj) */

public class Test3 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		System.out.println(hs);
		System.out.println(hs.remove("C"));
		System.out.println(hs);
		System.out.println(hs.remove("C"));
		System.out.println(hs);
		

	}

}
