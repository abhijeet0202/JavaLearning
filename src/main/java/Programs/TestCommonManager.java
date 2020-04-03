/**
 * 
 */
package Programs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author I17996
 *
 */
public class TestCommonManager {

	/**
	 * Test method for {@link Programs.CommonManager#CommonManager(int, java.lang.String)}.
	 */
	@Test
	public void testCommonManager() {
		CommonManager ceo = new CommonManager(1,"Ceo");
		CommonManager manager1 = new CommonManager(1,"Manager1");
		CommonManager manager2 = new CommonManager(1,"Manager2");
		CommonManager employee1 = new CommonManager(1,"Employee1");
		CommonManager employee2 = new CommonManager(1,"Employee2");
		CommonManager employee3 = new CommonManager(1,"Employee3");
		CommonManager employee4 = new CommonManager(1,"Employee4");
		
		
		manager1.myRepotee().add(employee1);
		manager1.myRepotee().add(employee2);
		manager2.myRepotee().add(employee3);
		manager2.myRepotee().add(employee4);
		
		ceo.myRepotee().add(manager1);
		ceo.myRepotee().add(manager2);
		
		CommonManager common = ceo.closestCommonManager(ceo, employee4, employee3);
		assertEquals(common, manager2);
		System.out.println("Common Report to :" +common.getName());
	}
	
	@Test
	public void testCommonManager1() {
		CommonManager ceo = new CommonManager(1,"Ceo");
		CommonManager manager1 = new CommonManager(1,"Manager1");
		CommonManager manager2 = new CommonManager(1,"Manager2");
		CommonManager employee1 = new CommonManager(1,"Employee1");
		CommonManager employee2 = new CommonManager(1,"Employee2");
		CommonManager employee3 = new CommonManager(1,"Employee3");
		CommonManager employee4 = new CommonManager(1,"Employee4");
		
		manager1.myRepotee().add(employee1);
		manager1.myRepotee().add(employee2);
		manager2.myRepotee().add(employee3);
		manager2.myRepotee().add(employee4);
		
		ceo.myRepotee().add(manager1);
		ceo.myRepotee().add(manager2);
		
		CommonManager common = ceo.closestCommonManager(ceo, employee1, employee3);
		assertEquals(common, ceo);
		System.out.println("Common Report to :" +common.getName());
	}

}
