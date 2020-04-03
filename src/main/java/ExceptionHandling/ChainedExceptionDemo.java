package ExceptionHandling;

class ChainedExceptionDemo {
	
	static void demoproc() {
		//creates an Exception
		NullPointerException ex = new NullPointerException("Top Layer;");
		
		//add a cause
		ex.initCause(new ArithmeticException("Actual cause"));
		throw ex;
	}

	public static void main(String[] args) {
		try{
			demoproc();
		} catch (NullPointerException ex){
			//display top level exception
			System.out.println("Caught" +ex);
			
			// display cause exception
			System.out.println("Original cause: " +ex.getCause());
		}

	}

}
