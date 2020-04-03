package JavaLang;

public final class MathDemo {

	public static void main(String[] args) {
		float f = 12.3f;
		
		//Returns the absolute value
		System.out.println("Math.abs(f):"+Math.abs(f));
		
		//Returns the cube root
		System.out.println("Math.cbrt(i):"+Math.cbrt(f));
		
		//Returns the smallest whole number greater than or equal to arg.
		System.out.println("Math.ceil(i):"+Math.ceil(f));
		
		//Returns the largest whole number less than or equal to arg
		System.out.println("Math.floor(i):"+Math.floor(f));
		
		//Returns the maximum
		System.out.println("Math.max(i,7):"+Math.max(f,7));
		//Returns units in the last place
		System.out.println("Math.ulp(i):"+Math.ulp(f));
		
		//Returns the integer nearest in value to arg
		System.out.println("Math.rint(i):"+Math.rint(f));
		
		//Returns arg rounded up to the nearest
		System.out.println("Math.round(i):"+Math.round(f));

	}

}
