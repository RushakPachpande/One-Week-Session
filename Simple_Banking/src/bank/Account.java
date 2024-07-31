
package bank;

public class Account {
	private int accountNumber;
	private double balance;
	private Customer customer;

	public Account(Customer customer, double initialBalance) {
		this.customer = customer;
		this.balance = initialBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber() {
		this.accountNumber = customer.getAccountNumber();
	}

	public void deposit(double amount) {
		System.out.println("Deposited Rs. " + amount);
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds");
		} else {
			System.out.println("Withdrawn Rs. " + amount);
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}

	public Customer getCustomer() {
		return customer;
	}
}