package InpuOutputStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Learning\\MyJavaLearning\\src\\InpuOutputStream\\a\\abhijeet.txt");
		file.getParentFile().mkdirs();
		try(BufferedWriter out = new BufferedWriter(new FileWriter(file))){
			out.write("CHULBUL PANDEY");
		} catch (IOException ex) {
			System.out.println("HAGOOOOO");
		}

	}

}
