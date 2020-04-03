package Generic;

class Gen<T>{
	T obj;
	
	T getObject(){
		return obj;
	}
	
	Gen(T o){
		obj = o;
	}
	
	void setObject(T ob){
		obj = ob;
	}
	
	void showType(){
		System.out.println("Data type of T is :"+obj.getClass().getName());
	}
}
class GenericSample {

	public static void main(String[] args) {
		Gen<Integer> myInt= new Gen<Integer>(33);
		myInt.setObject(50);
		myInt.showType();
		
		
		Gen<String> myStr= new Gen<String>("Banerjee");
		myStr.setObject("Abhijeet");
		myStr.showType();
	}

}
