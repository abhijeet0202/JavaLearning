package ExceptionHandling;

class CustomizedException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	public CustomizedException(String message) {
		super(message);
		if (message != null) {
			this.message = message;
		} else {
			this.message = "My Customized Exception";
		}
	}
	
		
	public String toString() {
		return "CustomizedException[" + message + "]";
		}

}

class ExceptionDemo {
	static void compute(int a) throws CustomizedException {
		System.out.println("Called compute(" + a + ")");
		if(a > 10)
			throw new CustomizedException("My Name is Abhijeet");
			System.out.println("Normal exit");
	}
	
	public static void main(String args[]) {
		try {
			compute(1);
			compute(20);
		} catch (CustomizedException e) {
			System.out.println("Caught " + e);
		}
	}
}
