package Interface;

public class StackMain{
	
	public static void main(){
		Stack stack = new ImplStack();
		stack.pop();
		for (int i =0; i< 10; i++)
			stack.push(i);
		for (int i =0; i< 10; i++)
		stack.pop();
	}
}
