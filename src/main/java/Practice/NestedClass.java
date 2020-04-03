package Practice;

class Outer{
	private int outer_x = 100;
	private static int outer_y = 100;
	
	void test(){
		Inner inner = new Inner();
		inner.display();
		inner.inner_x =30;
	}
	
	//this is inner class
	private class Inner{
		private int inner_x = 20;
		Outer out = new Outer();
		
		void display(){
			System.out.println("display: outer_x = "+outer_x);
			System.out.println("display: outer_x = "+Outer.outer_y);
			System.out.println("display: inner_x = "+inner_x);
		}
	}
	
	class InnerAgain extends Inner{
		private int inner_x = 20;
		Outer out = new Outer();
		
		void display(){
			System.out.println("display: outer_x = "+out.outer_x);
			System.out.println("display: outer_x = "+outer_y);
			System.out.println("display: inner_x = "+inner_x);
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.test();
	}
}
