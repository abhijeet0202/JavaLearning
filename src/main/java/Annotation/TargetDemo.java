package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface myTarget{	
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface myAgainTarget{
}

@myTarget
@myAgainTarget
public class TargetDemo {
	
	//@myTarget
	@myAgainTarget
	public void printAll() {
		System.out.println("myTarget Annotation will not work");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
