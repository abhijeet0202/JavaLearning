package Collection;

import java.util.HashSet;
import java.util.Set;

public class DemoHashCodeVsEqual {

	public static void main(String[] args) {
		System.out.println("a1");
		MyClass myClass = new MyClass("Abhijeet", "Banerjee");
		System.out.println("a2");
		MyClass myClass1 = new MyClass("Abhijeet", "Banerjee1");
		System.out.println("a3");
		
		Set<MyClass> obj = new HashSet<MyClass>();
		System.out.println("a4");
		obj.add(myClass);
		System.out.println("a5");
		obj.add(myClass1);
		System.out.println("a6");
		System.out.println(obj);
	}

}
class MyClass {

    private final String importantField;
    private final String anotherField;

    public MyClass(final String equalField, final String anotherField) {
        this.importantField = equalField;
        this.anotherField = anotherField;
    }

    public String getEqualField() {
        return importantField;
    }

    public String getAnotherField() {
        return anotherField;
    }

    @Override
    public int hashCode() {
    	System.out.println("a");
        final int prime = 31;
        System.out.println("b");
        int result = 1;
        result = prime * result
                + ((importantField == null) ? 0 : importantField.hashCode());
        System.out.println("c");
        System.out.println(result);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
    	System.out.println("1");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        
        System.out.println("2");
        if (getClass() != obj.getClass())
            return false;
        
        System.out.println("3");
        final MyClass other = (MyClass) obj;
        System.out.println("4");
        if (importantField == null) {
        	System.out.println("5");
            if (other.importantField != null)
                return false;
        } else if (!importantField.equals(other.importantField))
            return false;
        System.out.println("6");
        return true;
    }
    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("importantField:");
		builder.append(importantField);
		builder.append(";anotherField:");
		builder.append(anotherField);
		return builder.toString();
	}

}