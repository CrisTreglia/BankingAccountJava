package Core;

public class SavingsAccount extends Account{
	
	public SavingsAccount(Customer customer) {
		super(customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printBalance() {
		System.out.println("=== Savings Account Balance ===");
		super.printCommonInformation();
	}
}
