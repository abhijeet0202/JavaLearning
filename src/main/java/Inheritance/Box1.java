package Inheritance;

public class Box1  {
	double width;
	double height;
	double depth;
	
	// Copy construct
	Box1(Box1 boxObj){
		this.width = boxObj.width;
		this.height = boxObj.height;
		this.depth = boxObj.depth;
		System.out.println("Inside Box(Box boxObj)");
		System.out.println();
	}
	
	//parametrized constructor
	Box1(double width,double height, double depth){
		this.depth = depth;
		this.width = width;
		this.height = height;
		System.out.println("Box(double width,double height, double depth)");
	}
	
	//Default Constructor
	Box1()
	{
		this.depth = 21;
		this.width = 11;
		this.height = 1;
		System.out.println("Box()");
	}
	
	//Constructor when Cube is created
	Box1(double length){
		this.depth = this.height = this.width = length;
		System.out.println("Box(double length)");
	}
	double volume(){
		System.out.println("double volume()");
		return depth*height*width;
		
	}
}


