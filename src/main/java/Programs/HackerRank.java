package Programs;

import java.util.List;

public class HackerRank {

	public static List<Integer> costRows;
	public static List<Integer> costCols;

	public static void solution(int a, int b) {
		String str = new String();
		int temp = a + b;
		int countA = 0;
		int countB = 0;
		boolean flag = true;
		boolean priorityA = false;
		boolean priorityB = false;
		int priA = 0;
		int priB = 0;

		for (int i = 0; i < temp; i++) {
			if (a > b) {
				priorityA = true;
			} else {
				priorityB = true;
			}
			if (a > 0 && countA < 2 && priorityA) {
				if (priA == 1)
					priorityA = false;
				countB = 0;
				str += 'a';
				a = a - 1;
				countA++;
				if (countA == 2) {
					priorityB = true;
					priB = 1;
				}
			} else if (countB < 2 && b > 0 && priorityB) {
				if (priB == 1)
					priorityB = false;
				countA = 0;
				str += 'b';
				b = b - 1;
				countB++;
				if (countB == 2) {
					priorityA = true;
					priA = 1;
				}
			} else {
				System.out.println("Wrong Format");
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(str);

	}

	public static void main(String[] args) {
		HackerRank.solution(10, 4);

	}

}
