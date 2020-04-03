/**
 * 
 */
package InpuOutputStream;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/**
 * @author abhibane
 *
 */
final class FileDemo implements Closeable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("C:\\Users\\abhibane\\Desktop", "RunClient.bat");
		
		System.out.println("Do File Exist :" + file.exists());
		System.out.println("File Name :" + file.getName());
		System.out.println("File Absolute Path :" + file.getAbsolutePath());
		System.out.println("File Path :" + file.getPath());
		
		System.out.println("File Parent Path :" + file.getParent());		
		System.out.println("Free Space (In GB) :" + file.getFreeSpace()/(1024*1024*1024));
		System.out.println("Free Space (In GB) :" + file.getTotalSpace()/(1024*1024*1024));
		System.out.println("Free Space (In GB) :" + file.getUsableSpace()/(1024*1024*1024));
		
		System.out.println("File Having Read Permission :" + file.canRead());
		System.out.println("File Having Write Permission :" + file.canWrite());
		System.out.println("File Is Hidden :" + file.isHidden());
		
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
