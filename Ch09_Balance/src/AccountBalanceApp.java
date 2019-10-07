import java.text.NumberFormat;

public class AccountBalanceApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Account Balance Calculator\n");

		String choice = "y";
		CheckingAccount ca = new CheckingAccount(1000, 1);
		SavingsAccount sa = new SavingsAccount(1000, .01);

		System.out.println("Start Balances:");
		printAccountBalance(ca, sa);
		System.out.println("Enter transactions for the month: ");
		while (choice.equalsIgnoreCase("y")){
			
			String txn = Console.getString("Withdraw or Deposit (w/d): ");
			String acct = Console.getString("Checking or Savings (c/s): ");
			double amt = Console.getDouble("amount: ", 0, Double.POSITIVE_INFINITY);

			//Polymorhism example
			Account a = null;
			if (acct.equalsIgnoreCase("C"))
				a = ca;
			else if (acct.equalsIgnoreCase("s"))
				a = sa;
			if (txn.equalsIgnoreCase("w"))
				a.withdraw(amt);
			else if (txn.equalsIgnoreCase("d"))
				a.deposit(amt);

			choice = Console.getString("Continue (y/n): ");
		}
		sa.applyPaymentToBalance();
		ca.subtractMonltyFee();
		
		System.out.println("Monthly Payments and Fees");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println("Checking Fee: " + nf.format(ca.getMonthlyFee()));
		System.out.println("Savings intrest payment: " + nf.format(sa.getInterestPayment()));
		
		System.out.println("Final Balances:");
		printAccountBalance(ca, sa);
		System.out.println("Goodbye");

	}

	private static void printAccountBalance(CheckingAccount ca, SavingsAccount sa) {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));
	}
}
