package Core;

public interface IAccount {
	
	void withdraw(double amount);
	
	void deposit(double amount);
	
	void transfer(double amount, Account toAccount);
	
	void printBalance();
}