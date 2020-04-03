package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation{
	String name();
	int age();
}

class BasicReflection {

	@myAnnotation(name = "abhijeet",age = 30)
	public static void myFunction(){
		BasicReflection br = new BasicReflection();
		
		try{
			Class<?> cl = br.getClass();
			System.out.println("Value of Class.getClass is :"+cl);
			System.out.println("Value of Class.getClass.getSimpleName is :"+cl.getSimpleName());
			System.out.println("Value of Class.getClass.getCanonicalName is :"+cl.getCanonicalName());
			System.out.println("Value of Class.getClass.getModifiers is :"+cl.getModifiers());
			System.out.println("Value of Class.getClass.getTypeName is :"+cl.getTypeName());
			System.out.println("Value of Class.getClass.hashCode is :"+cl.hashCode());
			
			System.out.println("**************************************************************************");
			Method method = cl.getMethod("myFunction");
			System.out.println("Value of Method.getMethod is :"+method);
			System.out.println("Value of Method.getMethod.getName is :"+method.getName());
			System.out.println("Value of Method.getMethod.getParameterCount is :"+method.getParameterCount());
			System.out.println("Value of Method.getMethod.getModifiers is :"+method.getModifiers());
			System.out.println("Value of Method.getMethod.getDeclaringClass is :"+method.getDeclaringClass());
			System.out.println("Value of Method.getMethod.getParameterTypes is :"+method.getParameterTypes());
			System.out.println("Value of Method.getMethod.hashCode is :"+method.hashCode());
			
			System.out.println("**************************************************************************");
			myAnnotation myAnno = method.getAnnotation(myAnnotation.class);
			System.out.println("Value of myAnnotation.getAnnotation is :"+myAnno);
			System.out.println("Value of myAnnotation.getAnnotation.age is :"+myAnno.age());
			System.out.println("Value of myAnnotation.getAnnotation.hashCode is :"+myAnno.hashCode());
			System.out.println("Value of myAnnotation.getAnnotation.name is :"+myAnno.name());
			System.out.println("Value of myAnnotation.getAnnotation.annotationType is :"+myAnno.annotationType());
			
			
		} catch (NoSuchMethodException ex){
			System.out.println(ex);
		}catch (Exception ex){
			System.out.println(ex);
		}
	}
	
	@myAnnotation(name = "abhijeet",age = 30)
	public static void myFunction(String title, int price){
		BasicReflection br = new BasicReflection();
		
		try{
			Class<?> cl = br.getClass();
			
			Method method = cl.getMethod("myFunction", String.class, int.class);
			System.out.println("----------------------------------------");
			System.out.println("Value of Method.getMethod is :"+method);
			method.getAnnotation(myAnnotation.class);
			
		} catch (NoSuchMethodException ex){
			System.out.println(ex);
		}catch (Exception ex){
			System.out.println(ex);
		}
	}
	
	public static void main(String[] args) {
		myFunction();
		myFunction("Banerjee", 2000);
	}

}
