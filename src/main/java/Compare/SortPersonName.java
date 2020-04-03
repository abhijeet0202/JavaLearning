package Compare;

import java.util.Comparator;

public class SortPersonName implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2){
		return p1.getPersonName().compareToIgnoreCase(p2.getPersonName());
	}

}
