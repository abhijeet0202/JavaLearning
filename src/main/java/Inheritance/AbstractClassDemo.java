package Inheritance;

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		//Cant instantiate Object of Abstract class
		/*
		 * AbstractFigure f = new AbstractFigure(10, 10);
		 * figref = f;
		 * System.out.println("Area is " + figref.area());
		 */
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		
		AbstractFigure figref;
		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
		

	}

}
