
/* Array to ArrayList Convertion*/
package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2Arraylist_conversion {

	public static void main(String[] args){
		
		/* Array Declaration and Initialization */
		String citynames[]={"Bhopal","Agra","Mysore","Chandigar"};
		
		/* Array to Arraylist convertion */
		ArrayList<String> Citylist=new ArrayList<String>(Arrays.asList(citynames));
		
		/* Adding new elements to converted list */
		Citylist.add("Bangalore");
		Citylist.add("Hyderabad");
		
		/* final Arraylist contest display using for */
		
		for(String str:Citylist){
			System.out.println(str);
		}
		
	}
}
