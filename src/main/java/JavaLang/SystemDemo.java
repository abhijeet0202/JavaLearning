package JavaLang;

final class SystemDemo {

	public static void main(String[] args) {
		
		//Returns the console associated with the JVM. null is returned if the JVM currently has no console
		System.out.println(System.console());
		
		//
		//Map<String, String> myMap;
		
		//Returns the current time in terms of milliseconds
		System.out.println(System.currentTimeMillis());
		
		//getProperty +  System Variables
		System.out.println("java.class.path:"+System.getProperty("java.class.path"));
		System.out.println("java.class.version:"+System.getProperty("java.class.version"));
		System.out.println("java.compiler:"+System.getProperty("java.compiler"));
		System.out.println("java.vm.name:"+System.getProperty("java.vm.name"));
		System.out.println("os.arch:"+System.getProperty("os.arch"));
		System.out.println("user.name:"+System.getProperty("user.name"));
		System.out.println("os.name:"+System.getProperty("os.name"));
	}

}
