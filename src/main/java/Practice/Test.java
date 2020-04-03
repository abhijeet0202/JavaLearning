package Practice;

class Employee{
	int roll;
	public Employee(int roll) {
		this.roll = roll;
	}
}
public class Test {
	
	void funct() {
		Employee obj = new Employee(2);
		fun(obj);
		System.out.println(obj);
		System.out.println(obj.roll);
	}
	
	
	void fun(Employee emp) {
		System.out.println(emp);
		Employee rab = new Employee(31);
		System.out.println(rab);
		emp = rab;
	}

	public static void main(String[] args) {
		Test c = new Test();
		c.funct();

	}

}
