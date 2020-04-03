package Programs;

public class ValidTiangle {

	static String[] triangleOrNot(int[] a, int[] b, int[] c) {
		if (a.length <= 0 || a.length >= 100000 || b.length <= 0 || b.length >= 100000 || c.length <= 0
				|| c.length >= 100000) {
			return null;
		}
		if (a.length != b.length && b.length != c.length)
			return null;

		String array[] = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			if ((a[i] + b[i]) > c[i] && (a[i] + c[i]) > b[i] && (b[i] + c[i]) > a[i]) {
				array[i] = "Yes";
			} else {
				array[i] = "No";
			}
		}
		return array;

	}

	public static void main(String[] args) {
		
		int a[] = {7,10,7};
		int b[] = {2,3,4};
		int c[] = {2,7,4};
		
		String arr[]= ValidTiangle.triangleOrNot(a,b, c);
		for (int i=0; i<arr.length;i++)
			System.out.println(arr[i]);
}

}
