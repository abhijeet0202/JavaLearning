package JavaLang;

class A{
	
}

class X extends A{
	
}
public class ClassDemo {

	public static void main(String[] args) {
		A a = new A();
		X x= new X();
		
		Class<?> myClass;
		myClass = a.getClass();
		System.out.println("myClass.getName(): "+myClass.getName());
		System.out.println("myClass.getCanonicalName(): "+myClass.getCanonicalName());
		System.out.println("myClass.getSimpleName(): "+myClass.getSimpleName());
		
		System.out.println();
		
		myClass = x.getClass();
		System.out.println("myClass.getName(): "+myClass.getName());
		System.out.println("myClass.isInterface(): "+myClass.isInterface());
		System.out.println("myClass.getSuperclass(): "+myClass.getSuperclass());
		

	}

}
