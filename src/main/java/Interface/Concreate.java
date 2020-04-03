package Interface;


public class Concreate implements Interface1, Interface2{
	
	public static void main(String[] args) {
		
		Interface1 obj = new Concreate();
		obj.func();
		
		//Interface variables are by default static, we can't access it via Object
		//obj.i
		System.out.println(Interface1.i);
		
		//Interface variables are by default final, we can't change the value
		//Interface1.i = 4;
		
		//Interface member variables are by default final, we can change the value but we cant change the address
		Interface1.pck.j =4;
		
		Packageing mypack = new Packageing();
		//Interface1.pck = mypack;
		System.out.println(mypack);
	}	
		
	public void func(){
		System.out.println("Hi");
	}
	
	
}
