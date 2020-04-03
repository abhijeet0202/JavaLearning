package JavaLang;

public class CloneDemo implements Cloneable{
	public String str = null;
	
	public CloneDemo() {
		str = new String("Abhijeet");
	}

	public static void main(String[] args) {
		CloneDemo cloneDemo = new CloneDemo();
		System.out.println(cloneDemo);
		System.out.println(Integer.toHexString(cloneDemo.str.hashCode()));
		
		try {
			CloneDemo cloning = (CloneDemo) cloneDemo.clone();
			System.out.println(cloning);
			System.out.println(Integer.toHexString(cloning.str.hashCode()));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
