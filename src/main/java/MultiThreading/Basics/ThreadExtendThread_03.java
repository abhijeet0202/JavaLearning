package MultiThreading.Basics;

public class ThreadExtendThread_03 {

	public static void main(String[] args) {
		new ThreadExtendDemo();
		try{
			for(int i =0; i <5;i++){
				System.out.println("Value Of i inside main:"+i);
				Thread.sleep(10);
			}
		}catch (InterruptedException exp){
			
		}
	}
}

class ThreadExtendDemo extends Thread{
	
	@Override
	public void run(){
		try{
			for (int i = 0 ; i< 5; i++){
				System.out.println("Child Thread Information:\n Thread Name:"+this.getName()+"\n Thread ID"+this.getId()+"\n Thread Priority"+this.getPriority());
				Thread.sleep(1000);
			}
		} catch (InterruptedException exp) {
			System.out.println("Value of exp:"+exp.toString() );
		}
	}
	
	ThreadExtendDemo(){
		super("Abhijeet Thread");
		System.out.println("Child Thread"+this);
		start();
		
	}
}
