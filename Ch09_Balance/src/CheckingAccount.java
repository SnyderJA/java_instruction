
public class CheckingAccount extends Account {

	private double monthlyFee;

	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}
	
	
	public void subtractMonltyFee() {
		this.balance -= monthlyFee;
	}


	public double getMonthlyFee() {
		return monthlyFee;
	}
	
	
}
