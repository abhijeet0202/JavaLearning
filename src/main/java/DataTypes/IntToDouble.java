package DataTypes;

import java.util.ArrayList;
import java.util.List;

public class IntToDouble {

	static ArrayList<Double> convert(ArrayList<Integer> myArrayInt){
		ArrayList<Double> myArrayDouble = new ArrayList<Double>();
		for(Integer i: myArrayInt){
			myArrayDouble.add(i.doubleValue());
		}
		return myArrayDouble;
	}
	public static void main(String[] args) {
		//////////
		ArrayList<Integer> myArrayInt = new ArrayList<Integer>();
		myArrayInt.add(1);
		myArrayInt.add(2);
		myArrayInt.add(3);
		myArrayInt.add(4);
		ArrayList<Double> myArray = convert(myArrayInt);
		//////////
		 List<?> alist = new ArrayList<Integer>();
		 List<? extends Number> bList = new ArrayList<Integer>();
		 //List<?> cList = new ArrayList<? extends Number>();
		 //List<? extends Integer> dList = new ArrayList<Object>();
		 List<? super Integer> eList = new ArrayList<Number>();
		 //List<? super Number> fList = new ArrayList<Integer>();
		 //List<List<? super Integer>> gList = new ArrayList<ArrayList<Number>>();
		 //////////////////////////////////////////////////////////
	}

}
