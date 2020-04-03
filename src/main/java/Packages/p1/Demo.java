/**
 * 
 */
package Packages.p1;

/**
 * @author abhibane
 *
 */
public class Demo {

	public static void main(String[] args) {
		Protection ob1 = new Protection();
		Derived ob2 = new Derived();
		SamePackage ob3 = new SamePackage();
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);

	}

}
