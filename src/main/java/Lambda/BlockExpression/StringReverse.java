package Lambda.BlockExpression;

interface Reverse{
	String reverse(String str);
}
public class StringReverse {
	
	private String execute(String str) {
		String result = "";
		for (int i = str.length()-1; i>=0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		Reverse reverse = (str) -> {
			return stringReverse.execute(str);
		};		
		System.out.println("Reverse of String :"+ reverse.reverse("Abhijeet"));
	}
}
