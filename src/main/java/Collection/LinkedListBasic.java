package Collection;

import java.util.LinkedList;

final class LinkedListBasic {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("name");
		myList.offerFirst("is");
		myList.offerLast("Banerjee");
		myList.push("My");
		myList.addLast("Abhijeet");
		
		System.out.println("Linked List Contains :"+myList);
		
		myList.removeLast();
		System.out.println("Linked List Contains :"+myList);
		myList.removeFirst();
		System.out.println("Linked List Contains :"+myList);
		myList.removeFirstOccurrence("is");
		System.out.println("Linked List Contains :"+myList);
		
	}

}
