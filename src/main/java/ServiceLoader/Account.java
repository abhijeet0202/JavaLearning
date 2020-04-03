/**
 * 
 */
package ServiceLoader;

/**
 * @author I17996
 *
 */
public interface Account {
	
	String getType();
	
	int getBalance();
	
	String getBranch();
	
	void setType(String type);
	
	void setBalance(int balance);
	
	void setBranch(String branch);
	

}
