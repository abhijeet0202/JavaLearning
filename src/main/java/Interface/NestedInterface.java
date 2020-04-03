package Interface;

interface Interface {
	
	void callback();
	
	public interface InnerInterface{
		void callme();
	}

}

public class NestedInterface implements Interface.InnerInterface{
	
	public static void main(String[] args) {
		Interface.InnerInterface obj = new NestedInterface();
		obj.callme();
		
	}
	public void callme(){
		System.out.println("heellopppp");
	}
	
}
