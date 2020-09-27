package Banking;

public class BankAccount {
	private String firstName;
	private String lastName;
	private double balance;
	
	public static final int CHECKING = 1;
	public static final int SAVING = 2;
	
	private int accountType;
	
	public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.accountType = typeOfAccount;
	}
	
	// The branch argument is true if the customer is performing the transaction
	// at a branch with a teller,
	// It's false if the customer is performing the transaction at an ATM
	public double deposit(double amount, boolean branch) {
		balance += amount;
		return balance;
	}
	
	// The branch argument is true if the customer is performing the transaction
	// at a branch with a teller,
	// It's false if the customer is performing the transaction at an ATM
	public double withDraw(double amount, boolean branch) {
		balance -= amount;
		return balance;
	}

	public double getBalance() {
		return balance;
	}
	
	// More methods that use firstName lastName and perform other functions

	public boolean isChecking() {
		return accountType == CHECKING;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
