package ExceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) {
		try{
			demoproc();
		}
		catch (CustomizedException ex) {
			System.out.println("Re_Caught:"+ex.toString());			
		}
	}
	
	 static void demoproc(){
		try{
			System.out.println("Inside DemoProc...Throw Explicitly NullPointer Exception");
			throw new CustomizedException("Demo of Throw with new()");
		}
		catch(NullPointerException ex){
			System.out.println("Catch:"+ex);
			System.out.println("Catch:"+ex.getMessage());
			throw ex;
		}
	}

}


