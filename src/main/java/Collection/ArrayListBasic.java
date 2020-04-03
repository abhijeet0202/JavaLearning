package Collection;

import java.util.ArrayList;

/*
 * ArrayList class extends AbstractList and implements the List interface
 */
final class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		System.out.println("Initial size of ArrayList is: "+obj.size() );
		
		/*
		 * Inserts the specified element at the specified position in this list.
		 * Shifts the element currently at that position (if any) and any subsequent elements to the right.
		 */
		obj.add(0,"Abhijeet");
		obj.add(1, "Banerjee");
		obj.add(0,"Abhijeet1");
		obj.add(1, "Banerjee1");
		/*
		 * Appends the specified element to the end of this list.
		 */
		obj.add("Aryan");
		
		System.out.println("Content of ArrayList is: "+obj);
	
		/*
		 * Removes the element at the specified position in this list. 
		 * Shifts any subsequent elements to the left.
		 */
		obj.remove(1);
		/*
		 * Removes the first occurrence of the specified element from this list
		 */
		obj.remove("Abhijeet1");
		System.out.println("Content of ArrayList is: "+obj);
		
		obj.add(2, "Lakhan");
		System.out.println("Content of ArrayList is: "+obj);
		
		obj.set(2, "Ram");
		System.out.println("Content of ArrayList is: "+obj);
		
		obj.add(3,null);
		
		obj.get(3);
		System.out.println(obj.get(3));
	}

}
