
package bank;

public class BankingSystem {
	public static void main(String[] args) {
		Customer cust = new Customer("Rushak Pachpande", 12345);
		Account acc = new Account(cust, 5000.0);
		System.out.println("Customer Name: " + cust.getName());
		System.out.println("Account number: " + cust.getAccountNumber());
		System.out.println("Initial Balance: " + acc.getBalance());
		acc.deposit(500.0);
		System.out.println("Balance: " + acc.getBalance());
		acc.withdraw(200.0);
		System.out.println("Balance: " + acc.getBalance());
	}
}