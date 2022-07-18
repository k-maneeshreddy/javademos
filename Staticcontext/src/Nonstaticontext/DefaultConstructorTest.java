package Nonstaticontext;

import Finance.BankAccount;
public class DefaultConstructorTest {

        public static void main(String[] args) {
		
		Finance.BankAccount account1 = new Finance.BankAccount(1001, 5000);
		
		Finance.BankAccount account2 = new Finance.BankAccount(1002, 6500);
		
		account1.printAccount();
		account2.printAccount();
		
		
		
	}
}
