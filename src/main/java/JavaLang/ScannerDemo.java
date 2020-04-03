package JavaLang;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character data = sc.next().charAt(0) ;
		ScannerDemo.func(sc.next().charAt(0));
		//data.charValue() - 'A';
		//System.out.println(data.charValue() - 'A');
	}
	
	public static void func (Character data){
		System.out.println(data.charValue() - 'A');
	}

}
