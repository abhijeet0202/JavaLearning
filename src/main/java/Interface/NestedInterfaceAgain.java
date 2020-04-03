package Interface;

class InterfaceAgain{
	
	public interface NestedInt{
		boolean isNotNegative(int i);
	}
}

class implementingClass implements InterfaceAgain.NestedInt{
	
	public boolean isNotNegative(int i){
		return i < 0 ? false:true;
	}
}
public class NestedInterfaceAgain {

	public static void main(String[] args) {
		InterfaceAgain.NestedInt obj = new implementingClass();
		if( obj.isNotNegative(2)){
			System.out.println("Interger is Postive");
		}
		if ( !(obj.isNotNegative(-2))){
			System.out.println("Interger is Negative");
		}
	}

}
