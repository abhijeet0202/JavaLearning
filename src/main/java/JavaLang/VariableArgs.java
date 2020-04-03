package JavaLang;

public class VariableArgs {

	public static void main(String[] args) {

		VariableArgs var = new VariableArgs();
		var.printVarArgsDetails(10,20,30,70);
	}

	void printVarArgsDetails(int ... val){
		
		for (int i : val){
			System.out.println("Print value of i "+i);
		}
	}
}
