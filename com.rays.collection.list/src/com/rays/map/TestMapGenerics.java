package comm.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapGenerics {
// Generic provides a way in order to communicate the type of a collection to the compiler.
// Defines type of a collection to the compiler.
	
	public static void main(String[] args) {
		
		Map<Integer, String>  m = new HashMap<Integer, String>();
	
		m.put(8,"Twelve");
		m.put(null,"Seven");
		m.put(7,"Eleven");
		m.put(9,"Twelve");
		m.put(6, "Sixteen");
		m.put(2,"One");
		m.put(2, null);
		m.put(5, "Eight");
		m.put(3, "Eight");
		m.put(0, null);
		
		System.out.println("m :"+m);//Print the Map(key,Value)
		System.out.println(m.get(6));//Get Value of the Key
		System.out.println(m.size());//Print Size of the Map
		System.out.println(m.keySet());//Returns set of Keys
		System.out.println(m.isEmpty());//Boolean Shows of Its Empty or Not 
		System.out.println("m :"+m);//print the Map(Key,Value)
	}

}
