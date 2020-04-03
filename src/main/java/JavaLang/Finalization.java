package JavaLang;

class Box{
	private int weight, height;
	
	Box(int weight, int height){
		this.weight = weight;
		this.height = height;
	}
	
	void myprint(){
		System.out.println("Weight is :"+weight+" and height is :"+height);
	}
	
	protected void finalize() {
		System.out.println("Garbage occured");
	}
	
}
public class Finalization {
	
	public static void main(String[] args) {
		{
		Box b1 = new Box(2, 4);
		b1.myprint();
		b1 = null;
		}
		System.gc();
	}	

}
