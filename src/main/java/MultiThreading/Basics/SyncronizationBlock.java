package MultiThreading.Basics;

class CallmeAgain{

	void call(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}catch (InterruptedException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("]");
	}
}

class CallerAgain implements Runnable{
	Thread t;
	String msg;
	CallmeAgain callMe;

	CallerAgain(CallmeAgain callMe,String msg){
		this.callMe = callMe;
		this.msg = msg;
		t = new Thread(this);
		t.start();			
	}

	@Override
	public void run() {
		synchronized (callMe) {
			callMe.call(msg);	
		}
	}
}

public class SyncronizationBlock {

	public static void main(String[] args) {

		CallmeAgain callMe = new CallmeAgain();
		CallerAgain call1 = new CallerAgain(callMe, "Hello");

		CallerAgain call3 = new CallerAgain(callMe, "Abhijeet");
		CallerAgain call2 = new CallerAgain(callMe, "Hi");

		try{
			call1.t.join();
			call2.t.join();
			call3.t.join();
		}catch( InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}
