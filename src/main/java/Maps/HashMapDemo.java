/**
 * 
 */
package Maps;

import java.util.AbstractMap;
import java.util.HashMap;

/**
 * @author abhibane
 *
 */
final class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		myMap.put(1, "Abhijeet");
		myMap.put(2, "Banerjee");
		myMap.put(3, "Aryan");
		myMap.put(4, "Abhijeet");
		myMap.put(5, "Abhijeet");
		myMap.put(null, "Food");
		myMap.put(null, "Cult");
		
		System.out.println(myMap);
	}
}
