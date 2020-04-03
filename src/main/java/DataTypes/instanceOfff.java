package DataTypes;

class A{
	int ai,aj;
}

class B{
	int bi,bj;
}

class C extends A{
	int ci,cj;
}
class D extends A{
	int di,dj;
}
class E extends B{
	int ei,ej;
}
class instanceOfff {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A c = new C();
		A d = new D();
		B e = new E();
		
		if (a instanceof A){
			System.out.println("a is instance of A");
		}
		
		if (b instanceof B){
			System.out.println("b is instance of B");
		}
		
		if (c instanceof A){
			System.out.println("c is instance of A");
		}
		if (d instanceof A){
			System.out.println("d is instance of A");
		}
		if (e instanceof B){
			System.out.println("e is instance of B");
		}
		if (e instanceof E){
			System.out.println("e is instance of E");
		}
		if (c instanceof C){
			System.out.println("c is instance of C");
		}
		if (d instanceof D){
			System.out.println("d is instance of D");
		}
		

	}

}
