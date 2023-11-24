package Core;

public class ChequingAccount extends Account{
	
	public ChequingAccount(Customer customer) {
		super(customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printBalance() {
		System.out.println("=== Chequing Account Balance ===");
		super.printCommonInformation();
	}

}
