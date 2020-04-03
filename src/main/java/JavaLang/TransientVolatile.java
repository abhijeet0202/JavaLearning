package JavaLang;

class TransientVolatile {

	transient int iTransient;
	volatile int iVolatile;
	
	public TransientVolatile() {
		iTransient = 34;
		iVolatile = 23;
	}
	
	@Override
	public String toString(){
		
		StringBuffer sb = new StringBuffer();
		sb.append(iTransient).toString();
		sb.append("\t");
		sb.append(iVolatile).toString();
		
		String str = sb.toString();
		return str;
		
	}
	
	void printMyValues(){
		System.out.println("iTransient: "+iTransient);
		System.out.println("iVolatile: "+iVolatile);
	}
	public static void main(String[] args) {
		
		TransientVolatile tv = new TransientVolatile();
		tv.printMyValues();		
		System.out.println("TransientVolatile: "+tv);
	}

}
