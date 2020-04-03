package Programs;

/*
 * A thief trying to escape from a jail. 
 * He has to cross arr[] walls each with varying heights (every height is greater than 0).
 * He climbs X feet every time. 
 * But, due to the slippery nature of those walls, every time he slips back by Y feet.
 * 
 * Now the task is to calculate the total number of jumps required to cross all walls and escape from the jail.
 */

public class PrisonerBreak {

	public void jumpWall(int X, int Y, int arr[]){
		int count =0;
		for (int i = 0; i <arr.length;i++)
		{
			int wallHeight = arr[i];
			if (arr[i] <= X){
				++count;
			}else{
				if ((wallHeight%(X-Y)) ==0)
					count+= wallHeight/(X-Y);
				else
					count+= (wallHeight/(X-Y))+1;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		PrisonerBreak break1 = new PrisonerBreak();
		int[] mydata = new int[] { 6, 9, 11, 4, 5 };
		break1.jumpWall(4, 1, mydata);

	}

}
