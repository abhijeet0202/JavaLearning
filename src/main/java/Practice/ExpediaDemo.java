package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExpediaDemo {
	

	public static void main(String[] args) {
		// Map<String, String> myMap = new HashMap<String, String>();
		List<Integer> from = new LinkedList<Integer>();
		from.add(1);
		from.add(1);
		from.add(2);
		from.add(3);
		from.add(1);
		List<Integer> to = new LinkedList<Integer>();
		to.add(2);
		to.add(3);
		to.add(4);
		to.add(5);
		to.add(5);
		
		
		List<Integer> result = new ArrayList<Integer>();
		int counter = 0;
		int host = 1;
		boolean hostExist = true;
		
		
		while (hostExist) {			
			for (int i = 0; i < from.size();i++) {			
				if(from.get(i)== host) {
					int toValue = to.get(i);
					if (!result.contains(toValue))
					result.add(toValue);
				}
			}
			if (counter < result.size()) {
				host = result.get(counter);
				counter++;
			} else {
				hostExist = false;
			}
	}
		System.out.println(result);
	
	}
}
