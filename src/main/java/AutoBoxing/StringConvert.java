package AutoBoxing;

final class StringConvert {

	public static void main(String[] args) {
		Integer i = 12345;
		
		System.out.println("Decimal value of " +i+ " is :"+i.toString());
		System.out.println("Octal value of "+i+ " is :"+Integer.toOctalString(i));
		System.out.println("Hexadecimal value of "+i+ " is :"+Integer.toHexString(i));
		System.out.println("Binary value of "+i+ " is :"+Integer.toBinaryString(i));
		
		
	}

}
