package Programs;

public class TwoSums {
	private static int[] twoSums(int[] nums, int target) {
		int[] arr = null;
		for (int i=0;i<nums.length;i++) {
			if(nums[i] <=target) {
				for (int j=i+1;j<nums.length;j++) {
					if(nums[i] + nums[j] == target) {
						arr = new int[] {i , j };
					}
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[]{2,7,11,15};
		TwoSums.twoSums(arr, 9);
	}

}
