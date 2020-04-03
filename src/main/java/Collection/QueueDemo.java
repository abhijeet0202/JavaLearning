package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.offer(2);
		queue.offer(3);
		queue.add(4);
		queue.offer(2);
		queue.offer(2);
		queue.offer(2);
		System.out.println(queue);

		queue.poll();
		queue.remove();

		System.out.println(queue);
	}

}
