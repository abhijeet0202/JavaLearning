package Interface;

interface Stack {
	void push(int item);
	int pop();
}

class ImplStack implements Stack{
	
	private int max_stck[];
	private int tos;
	
	public ImplStack() {
		max_stck = new int[10];
		tos = -1;
	}
	
	public void push(int item){
		if (tos == max_stck.length -1 ){
			System.out.println("StackImpl Overloaded");
		}
		else
			max_stck[++tos] = item;
	}
	
	public int pop(){
		if (tos == -1){
			System.out.println("StackImpl UnderFlow");
			return 0;
		}
		else{
			return max_stck[tos--];
		}
	}
}
