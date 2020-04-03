package Programs;

public class DiverseDeputation {

	// Driver code
	public static void main(String[] args) {

		int men, women, group, minManInGroup;
		men = 2;
		women = 2;
		group = 3;
		minManInGroup = 1;
		System.out.println(ways(men, women, group, minManInGroup));
	}

	static int fact(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++)
			fact *= i;
		return fact;
	}

	// Function to calculate ncr
	static int ncr(int n, int r) {
		int ncr = fact(n) / (fact(r) * fact(n - r));
		return ncr;
	}

	// Function to calculate
	// the total possible ways
	static int ways(int men, int women, int group, int minManInGroup) {

		int ans = 0;
		while (men >= minManInGroup) {
			ans += ncr(men, minManInGroup) * ncr(women, group - minManInGroup);
			minManInGroup += 1;
		}
		return ans;
	}
}
