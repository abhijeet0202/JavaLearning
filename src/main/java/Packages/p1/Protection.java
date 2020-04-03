package Packages.p1;

public class Protection {

		int default_n = 1;
		private int pri_n =2;
		protected int pro_n =3;
		public int pub_n =4;
		
		public Protection(){
			System.out.println("Inside Protection Constructor");
			System.out.println("Value of default_n:"+default_n);
			System.out.println("Value of pri_n:"+pri_n);
			System.out.println("Value of pro_n:"+pro_n);
			System.out.println("Value of pub_n:"+pub_n);
		}
}
