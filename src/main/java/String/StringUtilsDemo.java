package String;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsDemo {

	public static void main(String[] args) {

	String str = "Abhijeet";
	String str1 = "";
	String str2 = null;
	
	System.out.println(StringUtils.isEmpty(str));
	System.out.println(StringUtils.isEmpty(str1));
	System.out.println(StringUtils.isEmpty(str2));
	}

}
