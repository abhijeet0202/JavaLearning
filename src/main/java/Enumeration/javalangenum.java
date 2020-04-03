package Enumeration;

enum Grapes{
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
	int price;
	
	Grapes(){
		this.price = -1;
	}
	
	Grapes(int price){
		this.price = price;
	}
}
class javalangenum {

	public static void main(String[] args) {
		Grapes grapes = Grapes.RedDel;
		Grapes gr1 = Grapes.Cortland;
		
		Grapes gr2 = Grapes.RedDel;
		
		//Using ordinal()
		System.out.println(grapes.ordinal());
		
		// Using compareTo()
		if (gr1.compareTo(grapes) != 0){
			System.out.println("Not Matched Unfortunatly");
		}
		
		// Using equals()
		if (gr2.equals(grapes)){
			System.out.println("Yo Yo Matched ");
		}
		// Using equals()
		if (gr2 == grapes){
			System.out.println("Yo Yo Matched ");				}
		}

}
