package Inheritance;

public class ReferenceObject {

	public static void main(String[] args) {
		
		BoxWeight boxWeightObj = new BoxWeight(2, 2, 2, 12.2);
		System.out.println("boxWeightObj:: "+boxWeightObj);
		Box1 boxobj = new Box1();
		System.out.println("boxobj:: "+boxobj);
		
		double volume = boxWeightObj.volume();
		System.out.println("Volume of a WeightBox Object is :"+volume);
		System.out.println("Weight of weightbox is " +boxWeightObj.weight);
		System.out.println();
		
		//Since BoxWeight is a subclass of Box, it is permissible to assign boxWeightObjreference to the boxobj object
		boxobj = boxWeightObj;
		
		System.out.println("boxobj:: "+boxobj);
		System.out.println("boxWeightObj:: "+boxWeightObj);
		
		volume = boxobj.volume(); // OK, volume() defined in Box
		boxobj.depth=5;
		volume = boxWeightObj.volume();
		System.out.println("Volume of a WeightBox Object is :"+volume);
		System.out.println("Volume of plainbox is " + volume);
		
		/* The following statement is invalid because plainbox does not define a weight member. */
		// System.out.println("Weight of plainbox is " + boxobj.weight);

	}

}
