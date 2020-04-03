package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {

	private int personId;
	private String personName;

	public Person(int personId, String personName) {
		this.personId = personId;
		this.personName = personName;
	}

	public final int getPersonId() {
		return personId;
	}

	public final void setPersonId(int personId) {
		this.personId = personId;
	}

	public final String getPersonName() {
		return personName;
	}

	public final void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * Compare current person with specified person return zero if person_id for
	 * both person is same return negative if current person_id is less than
	 * specified one return positive if specified person_id is greater than
	 * specified one
	 */
	@Override
	public int compareTo(Person p1) {
		return this.personId - p1.personId;
	}

	public static void main(String[] args) {
		List<Person> myList = new ArrayList<Person>();
		myList.add(new Person(1, "Robert"));
		myList.add(new Person(2, "Gobert"));
		myList.add(new Person(3, "Abhijeet"));
		
		Collections.sort(myList, new SortPersonName());
		for (Person person : myList) {
			 System.out.println("My name is "+person.getPersonName() + " and id is "+person.getPersonId());
		}
		System.out.println("-----------------------------------------");
		Collections.sort(myList);
		for (Person person : myList) {
			System.out.println("My name is "+person.getPersonName() + " and id is "+person.getPersonId());
		}
	}
}
