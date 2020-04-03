/**
 * 
 */
package ServiceLoader;

/**
 * @author I17996
 *
 */
public class SavingAccount implements Account {
	
	String branch;
	int balance;
	String type = "SAVINGACCOUNT";

	@Override
	public String getType() {
		System.out.println("Inside type of Saving Account");
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
