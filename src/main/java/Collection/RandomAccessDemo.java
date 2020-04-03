/**
 * 
 */
package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

/**
 * @author abhibane
 *
 */
final class RandomAccessDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> vecObj = new Vector<String>();
		vecObj.add("Abhijeet");
		
		LinkedList<String> llObj = new LinkedList<String>();
		llObj.add("Banerjee");
		
		if (vecObj instanceof RandomAccess){
			System.out.println("Vector Supports RandomAccess List");
			Iterator<String> obj = vecObj.iterator();
			System.out.println(obj.next());
		}
		
		if (!(llObj instanceof RandomAccess)){
			System.out.println("Linked List Does Not Supports RandomAccess List");
		}
	}

}
