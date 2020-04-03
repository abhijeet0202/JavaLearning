package Inheritance;

public abstract class AbstractFigure {
	
	double dimension1;
	double dimension2;
	/*abstract*/ static int i;
	
/*abstract*/ AbstractFigure(double dimension1,double dimension2) {
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		System.out.println("Inside AbstractFigure Constructor");
	}	
	abstract double area();
}

class Triangle extends AbstractFigure{
	
	public Triangle(double dimension1,double dimension2) {
		super(dimension1,dimension2);
		System.out.println("Inside Constructor for Triangle.");
		System.out.println();
	}
	
	double area(){
		System.out.println("Inside Area for Triangle.");
		return (dimension1 * dimension2) / 2;
	}
}

class Rectangle extends AbstractFigure{
	
	public Rectangle(double dimension1,double dimension2) {
		super(dimension1,dimension2);
		System.out.println("Inside Constructor for Rectangle.");
		System.out.println();
	}
	
	double area(){
		System.out.println("Inside Area for Rectangle.");
		return dimension1 * dimension2;
	}
}