package Banking;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void deposit() {
		BankAccount account = new BankAccount("Vimaljeet", "Singh", 1000.00);
		double balance = account.deposit(200.00, true);
		assertEquals(1200.00, balance, 0);
	}

	@Test
	public void withDraw() {
		fail("This test has yet to be implemented");
	}
	
	@Test
	public void getBalance_deposit() {
		BankAccount account = new BankAccount("Vimaljeet", "Singh", 1000.00);
		account.deposit(200.00, true);
		assertEquals(1200.00, account.getBalance(), 0);
	}
	
	@Test
	public void getBalance_withDraw() {
		BankAccount account = new BankAccount("Vimaljeet", "Singh", 1000.00);
		account.withDraw(200.00, true);
		assertEquals(800.00, account.getBalance(), 0);
	}

	@Test
	public void isChecking_true() {
		BankAccount account = new BankAccount("Vimaljeet", "Singh", 1000.00, BankAccount.CHECKING);
		assertEquals(true, account.isChecking());
	}
}
