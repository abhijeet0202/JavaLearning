package JavaLang;

public class finalObject {

	String name;
	int age;
	
	public finalObject() {
		name = "abhijeet";
		age = 3;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		final finalObject finalObject = new finalObject();
		finalObject finalObject1 = new finalObject();
		finalObject.setName("Bane");
		finalObject.setAge(22);
		System.out.println(finalObject.getAge()+":"+finalObject.getName());
		//finalObject = finalObject1;
		finalObject.setName("abh");
		finalObject.setAge(21);
		System.out.println(finalObject.getAge()+":"+finalObject.getName());

	}

}
