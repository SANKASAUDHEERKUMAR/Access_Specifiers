package Selenium_practice;

import java.awt.List;
import java.util.ArrayList;
import org.testng.reporters.jq.Main;

public class foreach {
public static void main(String[] args) {
	ArrayList<String> l=new ArrayList<String>();
	
	l.add("1");
	l.add("2");
	l.add("4");
	l.add("5");
	l.add("6");
	l.add("3");
	System.out.println(l);
	for(String ll:l){
		System.out.println(ll.indexOf(0));
		/*System.out.println(ll.indexOf("3"));
		System.out.println(ll.indexOf("5"));*/
		
	}
	
}
}
