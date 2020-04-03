package Collection;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		ArrayList<Double> doubleArrayList = new ArrayList<Double>();
		doubleArrayList.add(7.00);
		doubleArrayList.add(21.00);
		doubleArrayList.add(23.00);
		doubleArrayList.add(27.00);
		doubleArrayList.add(37.00);
		doubleArrayList.add(77.00);		
		doubleArrayList.add(77.00);
		
		
		Spliterator<Double> doubleSpliterartor = doubleArrayList.spliterator();
		System.out.println(doubleSpliterartor.characteristics());
		System.out.println(doubleSpliterartor.estimateSize());
		
		while(doubleSpliterartor.tryAdvance((n)->System.out.println(n)));
		
		ArrayList<Double> newArrayList = new ArrayList<>();
		doubleSpliterartor = doubleArrayList.spliterator();
		while(doubleSpliterartor.tryAdvance((n)-> newArrayList.add(Math.sqrt(n))));
		
		Spliterator<Double> newSpliterartor = newArrayList.spliterator();
		newSpliterartor.forEachRemaining((j)->System.out.println(j));
	}

}
