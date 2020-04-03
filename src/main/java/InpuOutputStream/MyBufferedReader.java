package InpuOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyBufferedReader {

	public static void main(String[] args) throws IOException {
		char c;
		String str;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			c = (char)br.read();
			System.out.println(c);
		}while(c != 'q');
		System.out.println("******************************************************************");
		do{
			str = br.readLine();
			System.out.println(str);
		}
		while(str != "stop");
	}
}
