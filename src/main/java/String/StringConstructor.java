package String;

import java.lang.reflect.Field;

class StringConstructor {

	public static int showInternalCharArrayHashCode(String s) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	    final Field value = String.class.getDeclaredField("value");
	    value.setAccessible(true);
	    return value.get(s).hashCode();
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		StringConstructor strObj = new StringConstructor();
		char arr[] = {'a', 'b', 'h', 'i', 'j', 'e', 'e', 't'};
		String str = new String(arr);
		System.out.println(str);
		
		String str1 = new String(str);
		System.out.println(str1);
		
		byte mybyte[] = {65, 66, 72, 73, 74, 69, 69, 84};
		String str3 = new String(mybyte);
		System.out.println(str3);
		
		/*******************************************/
		String one = "abc";
		String two = "abc";
		String three = new String("abc");
		System.out.println("one.value: " + StringConstructor.showInternalCharArrayHashCode(one));
		System.out.println("two.value: " + StringConstructor.showInternalCharArrayHashCode(two));
		System.out.println("three.value: " + StringConstructor.showInternalCharArrayHashCode(three));
		System.out.println("one" + System.identityHashCode(one));
		System.out.println("two" + System.identityHashCode(two));
		System.out.println("three" + System.identityHashCode(three));
		
		
		
		
		if(one == two){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		if(one == three){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		three = three.intern();
		System.out.println("one.value: " + StringConstructor.showInternalCharArrayHashCode(one));
		System.out.println("two.value: " + StringConstructor.showInternalCharArrayHashCode(two));
		System.out.println("three.value: " + StringConstructor.showInternalCharArrayHashCode(three));
		System.out.println("one" + System.identityHashCode(one));
		System.out.println("two" + System.identityHashCode(two));
		System.out.println("three" + System.identityHashCode(three));
	}

}
