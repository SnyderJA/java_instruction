
public class SavingsAccount extends Account {

	private double interestRate;
	private double interestPayment;

	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;

	}

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void applyPaymentToBalance() {
		this.interestPayment = balance * interestRate;
		this.balance += interestPayment;
	}

	public double getInterestPayment() {
		return interestPayment;
	}
	
	
	

}
