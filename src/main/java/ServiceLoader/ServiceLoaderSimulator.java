/**
 * 
 */
package ServiceLoader;

import java.util.ServiceLoader;

/**
 * @author I17996
 *
 */
public class ServiceLoaderSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceLoader<Account> loader =  ServiceLoader.load(Account.class);
		Account account = loader.iterator().next();
		System.out.println(account.getType());
		

	}

}
