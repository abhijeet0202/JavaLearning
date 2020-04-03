package Programs;

public class Drop2ElementsToSplitTheArraytoThreePartEvenly {

	public boolean solution(int[] A) {

		int leftPointer = 1;
		int rightPointer = A.length - 2;
		int leftPartSum, middlePartSum, rightPartSum;
		int[] sumArray = new int[A.length];

		// Initializing the sum array
		sumArray[0] = A[0];
		for (int i = 1; i < A.length; i++)
			sumArray[i] = sumArray[i - 1] + A[i];

		// Using two Pointer technique
		while (leftPointer < rightPointer) {

			leftPartSum = sumArray[leftPointer] - A[leftPointer];
			middlePartSum = sumArray[rightPointer] - sumArray[leftPointer] - A[rightPointer];
			rightPartSum = sumArray[A.length - 1] - sumArray[rightPointer];

			if (leftPartSum == middlePartSum && middlePartSum == rightPartSum)
				return true;

			if (leftPartSum < rightPartSum)
				leftPointer++;
			else if (leftPartSum > rightPartSum)
				rightPointer--;
			else { // Else condition denotes: leftPartSum == rightPartSum
				leftPointer++;
				rightPointer--;
			}
		}
		return false; // If no solution is found then returning false
	}

	public static void main(String[] args) {
		Drop2ElementsToSplitTheArraytoThreePartEvenly obj = new Drop2ElementsToSplitTheArraytoThreePartEvenly();
		int[] arr = {1,3,4,2,2,2,1,1,2};
		System.out.println(obj.solution(arr));

	}

}
