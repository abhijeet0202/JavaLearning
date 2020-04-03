package Programs;

/*
 * Find if array can be divided into two Sub Arrays of equal sum:
 * 
 * Given an array of integers, find if it’s possible to remove exactly 
 * one integer from the array that divides the array into two sub arrays 
 * with the same sum.
 * 
 * 	Input:  arr = [6, 2, 3, 2, 1]
 *  Output:  true
 *  Explanation:  On removing element 2 at index 1,the array gets divided into two subarrays [6]
 *				  and [3, 2, 1] having equal sum
 *
 *  Input:  arr = [6, 1, 3, 2, 5]
 *	Output:  true
 *	Explanation:  On removing element 3 at index 2,the array gets divided into two subarrays [6, 1]
 *				  and [2, 5] having equal sum.
 *
 *	Input:  arr = [6, -2, -3, 2, 3]
 *	Output: true
 *	Explanation:  On removing element 6 at index 0,the array gets divided into two sets [] and 
 *   			  [-2, -3, 2, 3] having equal sum
 *
 * Input:  arr = [6, -2, 3, 2, 3]
 * Output: false
 */

public class FindIfArrayCanBeDividedIntoTwoSubarraysOfEqualSum {

	void printSubArray(int array[], int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.print(":");
	}

	boolean divideArray(int array[], int number) {

		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += array[i];

		}
		int sum_so_far = 0;

		for (int i = 0; i < number; i++) {
			if (2 * sum_so_far + array[i] == sum) {
				System.out.println("Answer");
				printSubArray(array, 0, i - 1);
				printSubArray(array, i + 1, number - 1);
				return true;
			}
			sum_so_far += array[i];
			System.out.println(sum + ":::" + array[i] + "::::" + sum_so_far);
		}
		System.out.println("The array cannot be divided into two subarrays with equal sum");
		return false;
	}

	public static void main(String[] args) {
		FindIfArrayCanBeDividedIntoTwoSubarraysOfEqualSum find = new FindIfArrayCanBeDividedIntoTwoSubarraysOfEqualSum();
		int arr[] = { 6, -2, -3, 2, 3 };
		int total = 5;
		find.divideArray(arr, total);
	}

}
