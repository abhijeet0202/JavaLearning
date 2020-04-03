package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MyComparatorStudentAge implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.age - arg1.age;
	}
	
	
}
class Student implements Comparable<Student>{
	String name;
	int age;
	int marks;
	
	Student(String name,int age, int marks){
		this.name = name;
		this.age = age;
		this.marks= marks;
	}

	@Override
	public int compareTo(Student arg0) {
		return (arg0.marks - this.marks);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("name = ");
		return builder.append(name).append(" age= ").append(age).append(" marks :").append(marks).toString();
	}
}
public class ComparableDemo {

	public static void main(String[] args) {
		Student st = new Student("Abhijeet",30, 70);
		Student st1 = new Student("Banerjee",31, 92);
		Student st2 = new Student("Rabeya",11, 75);
		
		List<Student> class1Student = new ArrayList<>();
		class1Student.add(st);
		class1Student.add(st1);
		class1Student.add(st2);
		
		System.out.println("Before Sorting w.r.t Marks: "+class1Student);
		Collections.sort(class1Student);
		System.out.println("After Sorting w.r.t Marks: "+class1Student);
		
		MyComparatorStudentAge age = new MyComparatorStudentAge();
		System.out.println("Before Sorting w.r.t Age: "+class1Student);
		Collections.sort(class1Student, age);
		System.out.println("After Sorting w.r.t Age: "+class1Student);
		

	}

}
