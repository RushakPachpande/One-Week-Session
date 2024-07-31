
package bank;

public class Customer {
	private String name;
	private int accountNumber;

	public Customer(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
}