package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NonSerializableReference {
	static int age;
	transient static String name;
	transient int year;

	public String toString() {
		return ("NonSerializableReference: Name: " + name + ", Year: " + year + ", Age: " + age);
	}

	public NonSerializableReference(String nameArg, int year) {
		name = nameArg;
		this.year = year;
		age = 10;
	}
}

class SerializableReference implements Serializable {
	private static final long serialVersionUID = 1L;;
	static int age;
	transient int year;

	NonSerializableReference nonSerializableReference = null;

	public String toString() {
		return ("SerializableReference: Year: " + year + ", Age: " + age + "\t"+ nonSerializableReference);
	}
	
	public SerializableReference() {
		this.year = 1982;
		age = 10;
		nonSerializableReference = new NonSerializableReference("Abhijeet", 1982);
	}
}

public class NonSerializableReferenceDemo {

	public static void main(String[] args) {
		SerializableReference serializableReference = new SerializableReference();

		// Serializing The Data
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("Abhijeet.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(serializableReference);
			objectOutputStream.flush();
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			e.fillInStackTrace();
		}

		// DeSerialzing Data
		try {
			FileInputStream fileInputStream = new FileInputStream("Abhijeet.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			serializableReference = (SerializableReference) inputStream.readObject();
			inputStream.close();
			fileInputStream.close();
		} catch (Exception ex) {
			System.out.println(ex.getStackTrace() + "   " + ex);
		}
		System.out.println("Original externalizableDemo : " + serializableReference);
	}

}
