package Practice;

public class FirstCharacter {
	
	
	public static void main(String[] args) {
		boolean flag;
		for (int i =2; i <=50; i++) {
			flag = true;
			int temp = i/2;
			for (int j = 2; j <=temp; j++) {
				if (i % j == 0) {
					flag = false;
					break;	
				}
			}
			if(flag)
				System.out.println(i);
		}
		
				
	}

}
