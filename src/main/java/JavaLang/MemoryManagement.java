package JavaLang;

final class MemoryManagement {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		
		//Returns the total amount of memory in the Java virtual machine
		System.out.println("Total Memory is "+(r.totalMemory())/(1024*1024));
		
		//Returns the amount of free memory in the Java Virtual Machine
		System.out.println("Total Free Memory is "+(r.freeMemory())/(1024*1024));
		
		//Returns the maximum amount of memory that the Java virtual machine will attempt to use.
		System.out.println("Maximum Memory is "+(r.maxMemory())/(1024*1024));
		
		//Returns the number of processors available to the Java virtual machine.
		System.out.println("Total Available Processor is "+r.availableProcessors());
		
	}

}
