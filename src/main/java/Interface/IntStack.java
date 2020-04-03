/**
 * 
 */
package Interface;

//Define an Integer StackImpl interaface
interface IntStack {
	void push(int item); //store an item
	int pop(); //retrieve item

}

//An implementation of IntStack that uses fixed storage.
class FixedStack implements IntStack{
	private int stck[];
	private int tos;
	
	//Allocate and Initialize stack
	public FixedStack(int size) {
		stck = new int[size];
		tos =-1;
	}
	
	//Push an item into the stack
	public void push(int item){
		if (tos == stck.length-1){
			int temp[] = new int[stck.length * 2]; // double size
			for(int i=0; i<stck.length; i++) temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
		}
		else
			stck[++tos] = item;
	}
	
	//Pop An Item From The StackImpl
	public int pop(){
		if(tos <0){
			System.out.println("StackImpl is Empty");
			return 0;
		}
		else
			return stck[--tos];
			
	}
}


class IFTest {
	public static void main(String args[]) {
		FixedStack mystack1 = new FixedStack(5);
		FixedStack mystack2 = new FixedStack(8);

		// push some numbers onto the stack
		for(int i=0; i<5; i++) mystack1.push(i);
		
		for(int i=0; i<8; i++) mystack2.push(i);

		// pop those numbers off the stack
		System.out.println("StackImpl in mystack1:");
		for(int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("StackImpl in mystack2:");
		for(int i=0; i<8; i++)
			System.out.println(mystack2.pop());
	}
}