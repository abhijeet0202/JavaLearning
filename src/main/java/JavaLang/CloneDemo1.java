package JavaLang;

final class CloneMain implements Cloneable {
	int a;
	double d;

	CloneMain cloneTest(){
		try{
			return (CloneMain) super.clone();
		}
		catch (CloneNotSupportedException ex){
			System.out.println(ex);
			return this;
		}
	}
}

public class CloneDemo1{
	public static void main(String[] args) {
		
		CloneMain cd = new CloneMain();
		CloneMain clone;
		
		cd.a = 10;
		cd.d = 12.5;
		
		clone = cd.cloneTest();
		
		System.out.println("cd: " + cd.a + " " + cd.d);
		System.out.println("clone: " + clone.a + " " + clone.d);
	}
}
