package ExceptionHandling;

public class SimpleTryCatch {

	public static void main(String[] args) {
		SimpleTryCatch stc = new SimpleTryCatch();
		stc.func();
	}

	void func2()
	{
		System.out.println("\nHello World");
	}
	void func(){
		try{
			int i = 0;
			int a = 42/i;
			System.out.println("This will never print");
		}catch(Exception e){
			System.out.println("e.getMessage()::"+e.getMessage());
			System.out.println("e.getCause()::"+e.getCause());
			System.out.println("e.getClass()::"+e.getClass());
			System.out.println("e.getLocalizedMessage()::"+e.getLocalizedMessage());
			System.out.println("e.hashCode()::"+e.hashCode());
			System.out.println("e.toString()::"+e.toString());
			System.out.println("e::"+e);
			System.out.println("e.fillInStackTrace()"+e.fillInStackTrace());
				e.printStackTrace(System.err);
			func2();
		}
		
	}
}
