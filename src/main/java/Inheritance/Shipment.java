package Inheritance;

public class Shipment extends BoxWeight{
	double cost;
	
	// construct clone of an object
	Shipment(Shipment ob) { // pass object to constructor
		super(ob);
		cost = ob.cost;
		System.out.println("Inside Constructor Shipment(Shipment ob)");
	}
	// constructor when all parameters are specified
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m); // call superclass constructor
		cost = c;
		System.out.println("Inside Constructor Shipment(double w, double h, double d, double m, double c)");
	}
	
	// default constructor
	Shipment() {
		super();
		cost = -1;
		System.out.println("Inside Constructor Shipment()");
	}
	
	// constructor used when cube is created
	Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
		System.out.println("Inside Constructor Shipment(double len, double m, double c)");
	}
}
