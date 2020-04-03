package Maps;

import java.util.WeakHashMap;

class Demo{
	private String value;
	
	Demo(String value){
		this.value = value;
	}
	
	String getValue(){
		return this.value;
	}
}
public class WeakHashMapDemo {

	public static void main(String[] args) {
		//Step1
		Demo demo = new Demo("Abhijeet");
		
		//Step2
		WeakHashMap<Demo, String> myObj = new WeakHashMap<>();
		myObj.put(demo, "banerjee");
		System.out.println("Data inside map:"+myObj);
		
		//Step3
		demo = null;
		System.gc();
		for (int i =0 ; i <1000; i++){
			if (myObj.size() != 0) {
					System.out.println("At iteration " + i + " the map still holds the reference on someDataObject");
            } else {
                System.out.println("somDataObject has finally been garbage collected at iteration " + i + ", hence the map is now empty");
                break;
            }
		}
	}

}
