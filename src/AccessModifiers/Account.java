package AccessModifiers;

import java.util.ArrayList;


public class Account {
    @SuppressWarnings("unused")
	private String accountName;
    private int balance = 0;
    ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.setBalance(this.getBalance() + amount);
            System.out.println(amount + " deposited. Balance is now " + this.getBalance());
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if(withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.setBalance(this.getBalance() + withdrawal);
            System.out.println(amount + " withdrawn. Balance is now " + this.getBalance());
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        this.setBalance(0);
        for(int i : this.transactions) {
            this.setBalance(this.getBalance() + i);
        }
        System.out.println("Calculated balance is " + this.getBalance());
    }

	public void setBalance(int balance) {
		this.balance = balance;
	}







}
