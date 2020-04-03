package MultiThreading;

class ValidQueue{
	int value =0;
	boolean valueSet = false;

	synchronized int get(){
		while (!valueSet){
			try{
				wait();
			}catch (InterruptedException ex){
				System.out.println(ex);
			}
		}

		System.out.print("Hello ");
		valueSet = false;
		notify();
		return value;
	}

	synchronized void put(int v){
		while (valueSet){
			try{
				wait();
			} catch (InterruptedException ex){
				System.out.println(ex);
			}
		}
		value = v;
		System.out.println("World :"+ value);
		valueSet = true;
		notify();
		
	}
}

class ValidProducer implements Runnable{
	ValidQueue queue;

	ValidProducer(ValidQueue queue){
		this.queue = queue;
		new Thread(this, "Producer").start();
	}

	public void run(){
		int i =0;
		while(true){
			queue.put(++i);
		}
	}
}
class ValidConsumer implements Runnable{
	ValidQueue queue;

	ValidConsumer(ValidQueue queue){
		this.queue = queue;
		new Thread(this, "Consumer").start();
	}

	public void run(){
		while(true){
			queue.get();
		}
	}
}
public class HelloWorldSyncronized {

	public static void main(String[] args) {
		ValidQueue queue = new ValidQueue();
		new ValidProducer(queue);
		new ValidConsumer(queue);
	}
}
