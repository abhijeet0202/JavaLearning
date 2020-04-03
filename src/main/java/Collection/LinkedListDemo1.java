/**
 * 
 */
package Collection;

import java.util.LinkedList;

/**
 * @author abhibane
 *
 */
class Address{
	String name;
	String address;
	String city;
	String state;
	String country;
	int pinCode;
	
	public Address(String name,	String address,	String city, String state, String country, int pinCode) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	
	public String toString(){
		return name+"\t"+address+"\t"+city+"\t"+state+"\t"+country+"\t"+pinCode;
	}
}

final class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<Address> ll = new LinkedList<Address>();
		
		ll.add(new Address("Abhijeet", "Near Durga Puja Samiti", "Jamshedpur", "Jharkhand", "India", 831002));
		ll.add(new Address("Abhijeet", "House No. 208", "Gurgaon", "Haryana", "India", 122001));
		
		for (Address address : ll){
			System.out.println(address);
		}
	}

}
