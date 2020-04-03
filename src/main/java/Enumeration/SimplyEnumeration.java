package Enumeration;

enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class SimplyEnumeration {

	public static void main(String[] args) {
		Apple ap;
		ap = Apple.GoldenDel;
		System.out.println("ap: "+ap);

		//Comparing Enums
		if (ap == Apple.GoldenDel){
			System.out.println("Currently Enum Variable Conatins: "+ap);
		}
		
		//Using Swith Cases
		switch(ap){
		case Jonathan:
			System.out.println("Jonathan is red: "+ap);
			
		case GoldenDel:
			System.out.println("Golden Delicious is yellow: "+ap);
			break;
		case RedDel:
			System.out.println("Red Delicious is red: "+ap);
			break;
		case Winesap:
			System.out.println("Winesap is red: "+ap);
			break;
		}
		
		//Using values() pre-defined method of enum
		Apple app[] = Apple.values();
		System.out.println("Using VALUES() predefine method: ");
		for(Apple a : app){
			System.out.println(a);
		}
		
		//Using valueOf() pre-defined method of enum
		System.out.println("Using VALUESOf() predefine method:::::::::::::::: ");
		ap = Apple.valueOf("GoldenDel");
		System.out.println("ap: "+ap);
	}

}
