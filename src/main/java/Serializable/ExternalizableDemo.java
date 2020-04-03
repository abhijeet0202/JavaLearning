package Serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalizableItem implements Externalizable{

	static int age;
	transient static String name;
	transient int year;
	
	public String toString() {
		return ("Name: " + name + ", Year: " + year + ", Age: " + age); 
	}
	
	public ExternalizableItem() {
		System.out.println("Default Constructor Called");;
	}
	public ExternalizableItem(String name, int year) {
		ExternalizableItem.name = name;
		this.year = year;
		age = 10;
	}

	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = (String)obj.readObject();
		age = obj.readInt();
		year = obj.readInt();		
	}

	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeObject(name);
		obj.writeInt(age);
		obj.writeInt(year);		
	}
	
}

public class ExternalizableDemo{
	public static void main(String[] args) {
		ExternalizableItem externalizableDemo = new ExternalizableItem("Abhijeet", 1982);
		ExternalizableItem externalizableDemoAgain = null;
		
		//Serializing The Data
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("Abhijeet.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(externalizableDemo);
			objectOutputStream.flush();
			objectOutputStream.close();
			fileOutputStream.close();
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
		//DeSerialzing Data
		try {
			FileInputStream fileInputStream = new FileInputStream("Abhijeet.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			externalizableDemoAgain = (ExternalizableItem)inputStream.readObject();
			inputStream.close();
			fileInputStream.close();
		} catch(Exception ex) {
			System.out.println(ex.getStackTrace()+"   "+ ex);
		}
		System.out.println("Original externalizableDemo : "+externalizableDemo);
		System.out.println("externalizableDemoAgain : "+externalizableDemoAgain);
	}

}
