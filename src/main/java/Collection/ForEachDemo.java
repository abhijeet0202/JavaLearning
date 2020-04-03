/**
 * 
 */
package Collection;

import java.util.ArrayList;

/**
 * @author abhibane
 *
 */
final class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		
		for (int value : al) {
			System.out.print(value+ " ");
		}
		System.out.println();
		
	}

}
