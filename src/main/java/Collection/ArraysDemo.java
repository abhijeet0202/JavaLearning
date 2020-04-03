package Collection;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		String[] myArray = new String[] {"My", "Name","is", "Abhijeet", "Banerjee"};
		
		@SuppressWarnings("rawtypes")
		List myList = Arrays.asList(myArray);
		System.out.println(myList);
	}

}
