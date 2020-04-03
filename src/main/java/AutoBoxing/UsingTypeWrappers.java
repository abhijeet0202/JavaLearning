package AutoBoxing;

class UsingTypeWrappers {

	public static void main(String[] args) {
		int i = 100;
		byte b = 2;
		short s = 14;
		boolean bl = true;
		char ch = 'a';
		long l = 1234;
		double d = 234.23;
		float f = 12.2f;
		
		Integer iObj = new Integer(i);
		System.out.println("iObj.intValue(): "+iObj.intValue());
		
		System.out.println();
		Byte bObj = new Byte(b);
		System.out.println("bObj.byteValue(): "+bObj.byteValue());
		
		System.out.println();
		Short sObj = new Short(s);
		System.out.println("sObj.shortValue(): "+sObj.shortValue());
		
		System.out.println();
		Boolean blObj = new Boolean(bl);
		System.out.println("blObj.booleanValue(): "+blObj.booleanValue());
		
		System.out.println();
		Character chObj = new Character(ch);
		System.out.println("chObj.charValue(): "+chObj.charValue());
		
		System.out.println();
		Long lObj = new Long(l);
		System.out.println("lObj.longValue(): "+lObj.longValue());
		
		System.out.println();
		//Float
		Float fdObj = new Float(d);
		System.out.println("dObj.doubleValue(): "+fdObj.doubleValue());
		
		Float fObj = new Float(f);
		System.out.println("fObj.doubleValue(): "+fObj.doubleValue());
		
		Float fstrObj = new Float("23.4");
		System.out.println("dstrObj.doubleValue(): "+fstrObj.doubleValue());
				
		System.out.println();
		//Double
		Double dObj = new Double(d);
		System.out.println("dObj.doubleValue(): "+dObj.doubleValue());
		
		Double dfObj = new Double(f);
		System.out.println("dfObj.doubleValue(): "+dfObj.doubleValue());
		
		Double dstrObj = new Double("23.4");
		System.out.println("dstrObj.doubleValue(): "+dstrObj.doubleValue());
		
		//Not A Number
		System.out.println();
		Double d1 = new Double(1/0.);
		Double d2 = new Double(0/0.);
		System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
		System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
	}

}
