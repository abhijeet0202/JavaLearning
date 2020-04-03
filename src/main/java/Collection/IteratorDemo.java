/**
 * 
 */
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author abhibane
 *
 */
final class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("H");
		al.add("I");
		al.add("J");
		al.add("E");
		al.add("E");
		al.add("T");
		
		Iterator<String> it = al.iterator();
		while (it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		
		ListIterator<String> lit = al.listIterator();
		
		while( lit.hasNext()){
			lit.set(lit.next() + "+");
		}
		
		//Let See What was happend after using set() above
		System.out.print("Modified contents of al: ");
		it = al.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		
		
		System.out.println("Iterating Elements in Backward Direction");
		
		while (lit.hasPrevious()){
			System.out.print(lit.previous());
		}
		System.out.println();
	}
	

}
