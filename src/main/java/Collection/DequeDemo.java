package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		//All Below add element in last
		//Throws Exception if not able to insert
		deque.add(2); 
		deque.addLast(4);
		//Return False, if not able to insert
		deque.offer(6);
		deque.offerLast(8);
		
		//All Below add element in First
		//Throws Exception if not able to insert
		deque.push(1);		
		deque.addFirst(3);
		//Return False, if not able to insert
		deque.offerFirst(5);
		
		
		System.out.println(deque);
	}

}
