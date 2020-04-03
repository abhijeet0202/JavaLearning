/**
 * 
 */
package ServiceLoader;

/**
 * @author I17996
 *
 */
public class CurrentAccount implements Account {

	String branch;
	int balance;
	String type = "CURRENTACCOUNT";

	@Override
	public String getType() {
		System.out.println("Inside type of Current Account");
		return type;
	}

	@Override
	public int getBalance() {
		return balance;
	}

	@Override
	public String getBranch() {
		return branch;
	}

	@Override
	public void setType(String type) {
		this.type = type;
		
	}

	@Override
	public void setBalance(int balance) {
		this.balance = balance;
		
	}

	@Override
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
