/**
 * 
 */
package Compare;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author abhibane
 *
 */

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		System.out.println(o1 + "::::" +o2);
		return o2.compareTo(o1);
	}
	
	
}

class MyComparator1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		System.out.println(o1 + "::::" +o2);
		int k =  o1.substring(o1.lastIndexOf(' ')).compareTo(o2.substring(o2.lastIndexOf(' ')));
		
		if (k == 0){
			return o1.compareTo(o2);
		}
		else{
			return k;
		}
	}
	
	
}
final class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<String> myTree = new TreeSet<String>(new MyComparator());
		

		myTree.add("A");
		myTree.add("B");
		myTree.add("H");
		myTree.add("I");
		myTree.add("J");
		myTree.add("E");
		myTree.add("E");
		myTree.add("T");
		
		System.out.println(myTree);
		
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new MyComparator1());
		
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));
		
		Set<Map.Entry<String,Double>> set = tm.entrySet();
		
		for (Map.Entry<String, Double> myMap : set){
			System.out.println(myMap.getKey() + ":" + myMap.getValue());
		}
		
	}
}
