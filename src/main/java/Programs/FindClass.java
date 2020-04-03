/**
 * 
 */
package Programs;

/**
 * @author Aryan
 *
 */
abstract class Mammal{}

class Horse extends Mammal{
	void doHorseSound(){
		System.out.println("Hen...Hen..Hen");
	}
}
class Elephent extends Mammal{
	void doElephentSound(){
		System.out.println("Huu...Huu..Huu");
	}
}
class Dog extends Mammal{
	void doDogSound(){
		System.out.println("Bhow..Bhow..Bhow");
	}
}

class UnknownMammal{
	Mammal mammal;
	UnknownMammal(Mammal mammal){
		this.mammal = mammal;
		
		if (mammal instanceof Elephent){
			((Elephent)mammal).doElephentSound();
		}
		if (mammal instanceof Dog){
			((Dog) mammal).doDogSound();
		}
		if(mammal.getClass() == Horse.class){
			((Horse)mammal).doHorseSound();
		}
	}
}
public class FindClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mammal mammal = new Elephent();
		UnknownMammal unknownMammal = new UnknownMammal(mammal);
		mammal = new Horse();
		unknownMammal = new UnknownMammal(mammal);
		mammal = new Dog();
		unknownMammal = new UnknownMammal(mammal);
		
	}

}
