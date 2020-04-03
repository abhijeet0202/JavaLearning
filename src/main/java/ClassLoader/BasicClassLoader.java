package ClassLoader;

import java.util.ArrayList;

import com.sun.javafx.binding.Logging;

public class BasicClassLoader {

	public static void main(String[] args) {
		System.out.println("ClassLoader of this class : "+BasicClassLoader.class.getClassLoader());
		System.out.println("ClassLoader of sun.javafx.binding.Logging class : "+Logging.class.getClassLoader());
		System.out.println("ClassLoader of ArrayList class : "+ArrayList.class.getClassLoader());

	}

}
