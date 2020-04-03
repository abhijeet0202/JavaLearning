package Inheritance;

class BoxWeight extends Box1{
	double weight;
	
	//Constructor of Box Weight
	BoxWeight(double width,double height, double depth, double weight) {
		super(width, height,depth);
		this.weight = weight;
		System.out.println("BoxWeight(double width,double height, double depth, double weight)");
	}
	
	// construct clone of an object
	BoxWeight(BoxWeight ob) { // pass object to constructor
	super(ob);
	weight = ob.weight;
	System.out.println("BoxWeight(BoxWeight ob)");
	}
	
	// default constructor
	BoxWeight() {
		super();
		weight = -1;
		System.out.println("BoxWeight()");
	}
	// constructor used when cube is created
	BoxWeight(double len, double m) {
			super(len);
			weight = m;
			System.out.println("BoxWeight(double len, double m)");
	}
}