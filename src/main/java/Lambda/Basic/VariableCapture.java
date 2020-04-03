package Lambda.Basic;
class Instance{
	int i;
	String str;
	
	public Instance() {
		i = 20;
		str = "abhijeet";
	}
}
interface VariableCaptureInterface{
	void check();
}
public class VariableCapture {
	static int localStaticValue = 20;
	
	
	public static void main(String[] args) {
		int localValue =10;
		Instance instance = new Instance();
		
		
		VariableCaptureInterface captureInterface = ()->{
			//Local value
			// localValue = localValue *10; ERROR: Can't change local variable
			System.out.println(localValue); // We can just use localVariable to read
			
			//Static variable
			localStaticValue = localStaticValue *10; // static variable can be modified and read
			
			//Instance Variable
			instance.i = 30; // Instance variable can be modified and read
			Instance newInstance = new Instance();
			//instance = newInstance; ERROR: Can't change Instance variable
		};

	}

}
