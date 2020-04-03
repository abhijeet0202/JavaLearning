package InpuOutputStream;

import java.io.File;

public class FileListDemo {

	public static String[] list= null;
	
	public static boolean deleteDir(String filePath, boolean recursive){
		File f = new File(filePath);

		if (!f.exists()) 
            return false;
		if (f.isDirectory()) {
		    for (File c : f.listFiles())
		    	deleteDir(c.getAbsolutePath(),true);
		  }
		  if (!f.delete()){
		    //throw new FileNotFoundException("Failed to delete file: " + f);
			  System.out.println("Failed to delete file: " + f);
		  return false;
		  }
		  return true;
		
		/*File file = new File(filePath);

			if (!file.exists()) 
	            return true;
	        

	        if (!recursive || !file.isDirectory()) 
	            return file.delete();

	        list = file.list();
	        display();
	        for (int i = 0; i < list.length; i++) {
	            if (!deleteDir(filePath + File.separator + list[i], true)) {
	                return false;
	            }
	        }

	        file.delete();
	        if (file.exists())
	        	return false;
	        else
	        	return true;*/

	}

	
	public static void display() {
		
		for (int i = 0; i < list.length; i++) 
		System.out.println(list[i]);
	}

	public static void main(String[] args) {
		String filePath = "C:/legal";
		deleteDir(filePath, true);
	}

}
