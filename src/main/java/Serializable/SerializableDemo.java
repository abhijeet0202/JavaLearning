package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializableItem implements Serializable {

	private static final long serialVersionUID = 1L;
	static int age;
	transient static String name;
	transient int year;

	public String toString() {
		return ("Name: " + name + ", Year: " + year + ", Age: " + age);
	}

	public SerializableItem() {
		System.out.println("Default Constructor Called");
		;
	}

	public SerializableItem(String name, int year) {
		this.name = name;
		this.year = year;
		age = 10;
	}
}

public class SerializableDemo {

	public static void main(String[] args) {
		SerializableItem externalizableDemo = new SerializableItem("Abhijeet", 1982);
		SerializableItem externalizableDemoAgain = null;

		// Serializing The Data
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("Abhijeet.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(externalizableDemo);
			objectOutputStream.flush();
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		// DeSerialzing Data
		try {
			FileInputStream fileInputStream = new FileInputStream("Abhijeet.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			externalizableDemoAgain = (SerializableItem) inputStream.readObject();
			inputStream.close();
			fileInputStream.close();
		} catch (Exception ex) {
			System.out.println(ex.getStackTrace() + "   " + ex);
		}
		System.out.println("Original externalizableDemo : " + externalizableDemo);
		System.out.println("externalizableDemoAgain : " + externalizableDemoAgain);
	}

}
