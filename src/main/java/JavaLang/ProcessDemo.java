package JavaLang;

import java.io.InputStream;
import java.io.OutputStream;

final public class ProcessDemo extends Process{

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try{
		 p = r.exec("notepad");
		Thread.sleep(1000);
		 p.destroy();
		}catch (Exception ex){
			System.out.println(ex);
		}
		 
	}

	@Override
	public OutputStream getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getInputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getErrorStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int waitFor() throws InterruptedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int exitValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
