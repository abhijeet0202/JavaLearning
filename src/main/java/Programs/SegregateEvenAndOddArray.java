package Programs;

import java.util.Scanner;

public class SegregateEvenAndOddArray {
	int[] myArray;
	int length = 0;
	int left =0, right = 0;
	
	public SegregateEvenAndOddArray() {
		Scanner scan = new Scanner(System.in);
		
		try {

			System.out.println("Enter the Number of Array You Want to Insert: ");
			length = scan.nextInt();
			if (length <= 1 || length >= 50) {
				System.out.println("Wrong Input");
				return;
			}
			myArray = new int[length];
			System.out.println("Enter "+length+ " the Number : ");
			for (int i = 0; i < length; i++) {
				
				myArray[i] = scan.nextInt();
			}
		} finally {
			scan.close();
		}
	}
	
	void logicForSegregateEvenAndOddArray(){
		left = 0;
		right = length-1;
		while(left < right){
			//Keep incrementing left index until we see an odd number.
			while(((myArray[left])%2 ==0) && (left < right)){
				left++;
			}
			//Keep decrementing right index until we see an even number.
			while ((myArray[right]%2 !=0) && (left <right)){
				right--;
			}
			//If left < right then swap myArray[left] and myArray[right] and move 1 step ahead
			if (left < right){
				int temp = myArray[left];
				myArray[left] = myArray[right];
				myArray[right] = temp;
				left++;
				right--;
			}
		}
		
	}
	void display(){
		for (int i =0; i<length; i++){
			System.out.print(myArray[i]+"\t");
		}
	}
	public static void main(String[] args) {
		SegregateEvenAndOddArray evenAndOddArray = new SegregateEvenAndOddArray();
		evenAndOddArray.logicForSegregateEvenAndOddArray();
		evenAndOddArray.display();
	}

}
