package String;

public class ImmutableString {

	public static void main(String[] args) {
		String myname = "abhijeet";
		System.out.println(myname);
		
		String mySecondNm = myname;
		System.out.println(myname+ " "+mySecondNm );
		
		myname = myname.concat(" banerjee");
		System.out.println(myname+" "+mySecondNm);
		
		myname.concat("21786");  //This will not add any thing: Assignment missing
		System.out.println(myname+" "+mySecondNm);

	}

}
