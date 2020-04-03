/**
 * 
 */
package Collection;

import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author abhibane
 *
 */
public final class SortedSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SortedSet<Integer> mysortSet = new TreeSet<Integer>();
		SortedSet<Integer> mysortSet = new ConcurrentSkipListSet<Integer>();
		mysortSet.add(1);
		mysortSet.add(100);
		mysortSet.add(10);
		mysortSet.add(1000);
		mysortSet.add(11);
		mysortSet.add(110);
		mysortSet.add(1100);
		
		System.out.println(mysortSet);
		System.out.println(mysortSet.headSet(2000));
		System.out.println(mysortSet.tailSet(0));
	}

}
