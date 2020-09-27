package AccessModifiers;

public class Main {

    public static void main(String[] args) {
	    Account vimalsAccount = new Account("Vimaljeet");
	    vimalsAccount.deposit(1000);
	    vimalsAccount.withdraw(500);
	    vimalsAccount.withdraw(-200);
	    vimalsAccount.deposit(-20);
	    vimalsAccount.calculateBalance();
	    vimalsAccount.setBalance(5000);

        System.out.println("Balance on account is " + vimalsAccount.getBalance());
        vimalsAccount.transactions.add(4500);
        vimalsAccount.calculateBalance();
    }
}
