package Collection;

import java.util.ArrayList;

final class ArrayListDemotoArray {

	public static void main(String[] args) {
		ArrayList<String> myObj = new ArrayList<String>();
		
		myObj.add("My");
		myObj.add("name");
		myObj.add("is");
		myObj.add("Abhijeet");
		myObj.add("Banerjee");
		
		String obj[] = new String[myObj.size()];
		myObj.toArray(obj);
		
		for (int i =0; i < obj.length; i++ ){
			System.out.println("Array contains in index["+i+"] is :"+obj[i]);
		}
	}

}
