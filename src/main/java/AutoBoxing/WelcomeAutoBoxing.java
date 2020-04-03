/**
 * 
 */
package AutoBoxing;

/**
 * @author abhibane
 *
 */
class WelcomeAutoBoxing {

	/**
	 * @param args
	 */
	static int callAutoBoxFunction(Integer integer){
		System.out.println("Inside Function callAutoBoxFunction");
		System.out.println("Printing Integer: "+integer);
		return integer;
	}
	public static void main(String[] args) {
		int i = 100;
		byte b = 2;
		short s = 14;
		boolean bl = true;
		char ch = 'a';
		long l = 1234;
		double d = 234.23;
		
		Integer iObj = i;
		int j = iObj;
		System.out.println("Integer Object : "+iObj+ " j = "+j);
		
		Byte bObj = b;
		System.out.println("Byte Object: "+bObj);
		
		Short sObj = s;
		System.out.println("Short Object: "+sObj);
		
		Boolean blObj = bl;
		System.out.println("Boolean Object: "+blObj);
		
		Character chObj = ch;
		System.out.println("Character Object: "+chObj);
		
		Long lObj = l;
		System.out.println("Long Object: "+lObj);
		
		Double dObj = d;
		System.out.println("Double Object: "+dObj);
		
		System.out.println("**********Demo AutoBoxing and UnBoxing in Function Arguments And return Type***********************");
		iObj = callAutoBoxFunction(100);
		System.out.println("Integer Object : "+iObj);
		
		
		System.out.println("**********Demo AutoBoxing and UnBoxing in Expression like Airtmetic and logical***********************");
		Integer iOb, iOb2;
		iOb = 100;
		System.out.println("Original value of iOb: " + iOb);
		// The following automatically unboxes iOb, performs the increment, and then reboxes the result back into iOb.
		++iOb;
		System.out.println("After ++iOb: " + iOb);
		// Here, iOb is unboxed, the expression is evaluated, and the result is reboxed and assigned to iOb2.
		iOb2 = iOb + (iOb / 3);
		System.out.println("iOb2 after expression: " + iOb2);
		// The same expression is evaluated, but the result is not reboxed.
		i = iOb + (iOb / 3);
		System.out.println("i after expression: " + i);
	}

}
