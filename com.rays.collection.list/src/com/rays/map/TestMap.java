package comm.rays.map;
//An object that maps keys to values..

//Map is not a part of collection but it stores Data.

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	// Key : Should be Unique and Single element as 'Null' is allowed
	// Value : Duplicate can be applied and 'Null' is allowed for more than one time

	public static void main(String[] args) {
		//KeyWords(int,class,null,etc) element should always be Starts with SmallLetters.
		Map m = new HashMap() {
		};
		m.put("One", 1);
		m.put("two", 2);
		m.put(3, 3);
		m.put("four", 4);
		m.put(null, 5);
		m.put(6, 5);
		m.put("seven", null);
		m.put("888", null);

		System.out.println("m: " + m);
		System.out.println(m.containsKey(6));//Boolean Key-Identification
		System.out.println(m.get("seven"));//Shows associated Value to that Key
		System.out.println(m.containsValue(2));//Boolean Value-Identification
		System.out.println(m.get("888"));//Shows associated Value-Identification
		System.out.println(m.entrySet());
		System.out.println(m.isEmpty());//Boolean - Returns if The Map is Empty or Not
		System.out.println(m.remove("888"));//method of removing key element which also remove the value
		System.out.println("m: "+m);//Prints the Mapping (Key,Value)::IN its
		System.out.println(m.size());//Gives the size of Map
		System.out.println(m.values());//Prints only the Values in Map
	
	}
}
