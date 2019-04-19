package Collections;

/* public boolean addAll(collection c) */

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args){
		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		System.out.println(hs);
		HashSet hs1=new HashSet();
		System.out.println(hs1.addAll(hs));
		System.out.println(hs);
		System.out.println(hs1.addAll(hs));
		System.out.println(hs1);
		hs1.removeAll(hs);
		System.out.println(hs1);
		
	}
}
