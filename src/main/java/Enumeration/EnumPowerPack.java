package Enumeration;

enum Orange{
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
	int price;
	
	Orange(int price){
		System.out.println("Constructor Called::");
		this.price = price;
	}
	
	Orange(){
		System.out.println(" Default Constructor Called::");
		this.price = -1;
	}
	
	int getPrice(){
		return price;
	}
	
	void setPrice(int price){
		this.price = price;
	}
}
class EnumPowerPack {

	public static void main(String[] args) {
		Orange orange = Orange.Cortland;
		orange.getPrice();
		orange.setPrice(36);
		System.out.println("Price of Cortland Orange is :"+orange.getPrice());
		
		for (Orange a : Orange.values()){
			System.out.println("Orange is: "+a+"and its price is: "+a.getPrice());
		}
		

	}

}
