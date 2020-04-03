/**
 * 
 */
package Interface;

interface testBasic{
	int finalStaticVaraible =2;
	
	void checkProperty();
}
public class BasicInterface implements testBasic{
	
	int finalStaticVaraible = 3;

	@Override
	public void checkProperty() {
		System.out.println(finalStaticVaraible);
		
	}
	public static void main(String[] args) {
		BasicInterface basicInterface = new BasicInterface();
		System.out.println(basicInterface.finalStaticVaraible);
		System.out.println(testBasic.finalStaticVaraible);

	}

	

}
