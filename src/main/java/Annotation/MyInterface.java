package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyInterface {
	
	String value1() default "from interface";
	
	String value() default "from interface default value";

}
