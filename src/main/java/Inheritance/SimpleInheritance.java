/**
 * 
 */
package Inheritance;

/**
 * @author abhibane
 *
 */

//A simple example of inheritance
class Superclass{
	int i,j;
	private String str; 
	Superclass(){
		System.out.println("Inside Superclass");
	}
	void printij(){
		System.out.println("Value of i:"+i +"and j:" +j+ "and str:"+str);
	}
}

class Subclass extends Superclass{
	int k;
	
	Subclass(){
		System.out.println("Inside Subclass");
	}
	void printij(){
		System.out.println("AAValue of i:"+i +" and j:" +j+" and k:"+k);
	}
}
public class SimpleInheritance {
	public static void main(String[] args) {
		
		Superclass superObj =new Superclass();
		superObj.printij();
		
		//Subclass subObj = new Subclass();
		//subObj.i = 10;
		//subObj.j = 20;
		
		//subObj.str = "Abhijeet";  //The field Superclass.str is not visible
		//subObj.printijk();

	}

}
