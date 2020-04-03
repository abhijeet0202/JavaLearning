package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperNonSerializableItem {
	static int ageSuper;
	transient static String nameSuper;
	int yearSuper;
	
	public String toString() {
		return ("NameSuper: " + nameSuper + ", YearSuper: "+ yearSuper + ", AgeSuper: " + ageSuper);
	}

	public SuperNonSerializableItem() {
		System.out.println(" SuperNonSerializableItem Default Constructor Called");
	}
}

class SerializableItemAgain extends SuperNonSerializableItem implements Serializable {

	private static final long serialVersionUID = 1L;
	static int age;
	transient static String name;
	transient int year;

	public String toString() {
		return ("SerializableItemAgain:::::Name: " + name + ", Year: " + year + ", Age: " + age + ":::: NameSuper: " + nameSuper + ", YearSuper: "
				+ yearSuper + ", AgeSuper: " + ageSuper);
	}

	public SerializableItemAgain() {
		System.out.println("Default Constructor Called");
	}

	public SerializableItemAgain(String name1, int year) {
		name = name1;
		this.year = year;
		age = 10;
		nameSuper = name;
		this.yearSuper = year;
		ageSuper = 100;
	}
}

public class SuperClassSerializationDemo {

	public static void main(String[] args) {
		SerializableItemAgain externalizableDemo = new SerializableItemAgain("Abhijeet", 1982);
		SerializableItemAgain externalizableDemoAgain = null;

		// Serializing The Data
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("AbhijeetAgain.txt");
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
			FileInputStream fileInputStream = new FileInputStream("AbhijeetAgain.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			externalizableDemoAgain = (SerializableItemAgain) inputStream.readObject();
			inputStream.close();
			fileInputStream.close();
		} catch (Exception ex) {
			System.out.println(ex.getStackTrace() + "   " + ex);
		}
		System.out.println("Original externalizableDemo : " + externalizableDemo);
		System.out.println("externalizableDemoAgain : " + externalizableDemoAgain);
	}

}
