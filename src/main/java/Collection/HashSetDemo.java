package Collection;

import java.util.HashSet;
import java.util.Set;

public final class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		
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
		hs.add(null);
		
		
		System.out.println("Value Present In HashSet is: "+hs);
		
	}

}
