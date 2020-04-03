package Inheritance;
abstract class BaseStatic{
	
	public static void func1() {
		System.out.println("Calling Base:Static::Func1");
	}
}

class DerivedStatic extends BaseStatic{
	
	public static void func1() {
		System.out.println("Calling DerivedStatic::Func1");
	}
}
public class staticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
