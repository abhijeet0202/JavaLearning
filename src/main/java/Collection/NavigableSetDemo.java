package Collection;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public final class NavigableSetDemo {

	public static void main(String[] args) {
		//NavigableSet<Integer> mysortSet = new TreeSet<Integer>();
		NavigableSet<Integer> mysortSet = new ConcurrentSkipListSet<Integer>();
		mysortSet.add(1);
		mysortSet.add(100);
		mysortSet.add(10);
		mysortSet.add(1000);
		mysortSet.add(11);
		mysortSet.add(110);
		mysortSet.add(1100);
		
		System.out.println(mysortSet);
		System.out.println(mysortSet.floor(130)); //less than 130 is 110
		System.out.println(mysortSet.ceiling(9)); //greater Than is 10 
		System.out.println(mysortSet.higher(110)); // Higher than 110 is 1000
	}

}
