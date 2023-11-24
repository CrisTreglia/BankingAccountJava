package Core;

public abstract class Account implements IAccount{

	private static int INSNUMBERSTANDARD = 003;
	private static int TRANSITNUMSTANDARD = 4581;
	private static int SEQUENCIAL = 1;
	
	protected int accountNumber;
	protected int institutionNumber;
	protected int transitNumber;
	protected double balance;
	protected Customer customer;

	
	public Account(Customer customer) {
		this.institutionNumber = Account.INSNUMBERSTANDARD;
		this.transitNumber = Account.TRANSITNUMSTANDARD;
		this.accountNumber = SEQUENCIAL++;
		this.customer = customer;
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.balance = balance - amount;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance = balance + amount;
	}

	@Override
	public void transfer(double amount, Account toAccount) {
		// TODO Auto-generated method stub
		this.withdraw(amount);
		toAccount.deposit(amount);
	}
	
	protected void printCommonInformation() {
		System.out.println(String.format("Customer: %s", this.customer.getName()));
		System.out.println(String.format("Institution: %d", this.institutionNumber));
		System.out.println(String.format("Transit Number: %d", this.transitNumber));
		System.out.println(String.format("Account Number: %d", this.accountNumber));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getInstitutionNumber() {
		return institutionNumber;
	}

	public int getTransitNumber() {
		return transitNumber;
	}

	public double getBalance() {
		return balance;
	}

}
