package Maps;

public class HashAndIndexFor {
	
	static int hash(int h){
		/*
		 * Shift right zero fill operator.
		 * The left operands value is moved right by the number of bits specified 
		 * by the right operand and shifted values are filled up with zeros.
		 */
		//Just for Demo
		int i = 33;
		System.out.println("Before Shifting Right: "+Integer.toBinaryString(i));
		System.out.println(i= i >>> 12);
		System.out.println("After Shifting Right: "+Integer.toBinaryString(i));
		h ^= (h >>> 20) ^ (h >>> 12); 
		return h ^ (h >>> 7) ^ (h >>> 4);
	}
	
	static int indexFor(int hash){
		int i= hash & (16-1);
		System.out.println(i);
		return i;
	}

	public static void main(String[] args) {
		System.out.println(HashAndIndexFor.hash(133334));
		HashAndIndexFor.indexFor(31);
		HashAndIndexFor.indexFor(63);
		HashAndIndexFor.indexFor(95);

	}

}
