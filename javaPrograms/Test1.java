package Collections;

/* public boolean add(object obj) */
import java.util.HashSet;

public class Test1 {

	public static void main(String args[]){
		HashSet hs=new HashSet();
		System.out.println(hs.add("A"));
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		System.out.println(hs);
		System.out.println(hs.add("A"));
		System.out.println(hs.add("F"));
		System.out.println(hs);
		
	}
}
