package Annotation;

import java.lang.reflect.Field;

public class ReflectionDemo {

	@MyInterface(value = "hemant", value1 = "abhijeet")
	static private String myname = "patel";

//	@MyInterface
//	private String tl = "abhibane";
//
//	private String stl = "patel";

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		new ReflectionDemo().printValue();

	}

	private void printValue()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		for (Field field : getClass().getDeclaredFields()) {
			System.out.println(field.getName() + ":" + field.get(null));

			if (field.isAnnotationPresent(MyInterface.class)) {

				String val = field.getAnnotation(MyInterface.class).value();
				
				String val1 = field.getAnnotation(MyInterface.class).value1();

				field.set(null, val + val1);

				

			}
			else
				field.set(this, "unity");

			System.out.println(field.getName() + ":" + field.get(this));
		}

	}

}
