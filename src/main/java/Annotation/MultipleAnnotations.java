/**
 * 
 */
package Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author abhibane
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@interface myAnno{
	String name();
	int age();
}

@Retention(RetentionPolicy.RUNTIME)
@interface myAnnoAgain{
	String Description();
}

@myAnno(name = "Banerjee", age =20)
@myAnnotation(name = "Aryan", age =21)
@myAnnoAgain(Description = "Top of class")
class MultipleAnnotations {

	@myAnno(name = "Abhijeet", age =30)
	@myAnnotation(name = "Devraj", age =40)
	@myAnnoAgain(Description = "My Name is Aryan")
	public static void myFunction(){
		
		MultipleAnnotations multipleAnnotations = new MultipleAnnotations();
		try{
			//Fetching all the Class level Annotation and assignning  it to Array
			Annotation anno[] = multipleAnnotations.getClass().getAnnotations();
			
			//Printing all annotationn details 
			for (Annotation a : anno)
				System.out.println(a);
			System.out.println("*****************************************************************************");
			//Fetching all the Method level Annotation and assigning  it to Array
			//Method method = multipleAnnotations.getClass().getMethod("myFunction");
			//anno = method.getAnnotations();			
			anno = multipleAnnotations.getClass().getMethod("myFunction").getAnnotations();
			
			for (Annotation a : anno)
			System.out.println(a);
			
		}catch( Exception ex){
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		myFunction();
	}

}
