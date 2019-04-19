package Collections;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;


public class hashmapdemo {

	public static void main(String[] args) {
		//HashMap<String,Integer> hp= new HashMap<String,Integer>();
		HashMap<Integer,String> hp= new HashMap<Integer,String>();
		hp.put(1001,"sanka");
		hp.put(1002,"Sudheer");
		hp.put(1003,"Kumar");
		hp.put(1004,"SSK");
		Set<Map.Entry<Integer,String>> st=hp.entrySet();
		for(Map.Entry<Integer,String> me:st){
			System.out.println(me.getKey()+": "+me.getValue());
		}
	}
}
