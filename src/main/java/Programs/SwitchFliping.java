package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwitchFliping {

	public static void main(String[] args) {
		List<ArrayList<Integer>> obj = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(4);			
		obj.add(a);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(2);		
		b.add(6);		
		obj.add(b);
		ArrayList<Integer> c = new ArrayList<>();
		c.add(1);
		c.add(6);
		obj.add(c);
		System.out.println(obj);
		ArrayList<Boolean> switching = new ArrayList<>(Collections.nCopies(7, false)); 
		System.out.println(switching);
		
		for (int i =0; i< obj.size();i++) {
			int firstIndex = obj.get(i).get(0);
			int lastIndex = obj.get(i).get(1);
			for (int j =firstIndex ; j<= lastIndex; j++) {
					if(switching.get(j) == false) {
						switching.set(j, true);
					}else {
						switching.set(j, false);
					}
			}
		}
		System.out.println(switching);
		int total =0;
		for (int i =0 ; i<switching.size();i++) {
			if(switching.get(i) == true) {
				total+=i+1;
			}
		}
		System.out.println(total);
	}

}
