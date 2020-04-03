/**
 * 
 */
package Collection;

import java.util.LinkedHashSet;

/**
 * @author abhibane
 *
 */
final class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("G");
		hs.add("a");
		hs.add("A");
		hs.add("C");
		hs.add("J");
		hs.add("D");
		hs.add("F");
		hs.add("H");
		hs.add("I");
		hs.add("E");
		hs.add("B");
		hs.add("z");


		System.out.println("Value Present In HashSet is: "+hs);

	}

}

