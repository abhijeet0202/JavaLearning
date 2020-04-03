/**
 * 
 */
package Collection;

import java.util.TreeSet;

/**
 * @author abhibane
 *
 */
final class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();

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
		//hs.add(null);


		System.out.println("Value Present In HashSet is: "+hs);
		
		//NavigableSet
		System.out.println(hs.tailSet("I"));
	}

}



