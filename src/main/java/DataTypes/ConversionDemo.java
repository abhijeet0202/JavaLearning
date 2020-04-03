package DataTypes;

public class ConversionDemo {

	public static void main(String[] args) {
		byte b;
		int i = 256;
		double d = 324.323;
		
		System.out.println("Conversion From INT to BYTE");
		b = (byte)i;
		System.out.println("Value of b and i is :"+i+" "+b);
		
		i = (int)d;
		System.out.println("Value of i and d is :"+i+" "+d);
		
		b = (byte)d;
		System.out.println("Value of b and d is :"+b+" "+d);

	}

}
