package bonusprograma;

public class BankAccount {
	
	static String bankName = "Bank Of America";
	String accountHoldersName;
	String accountNumber;
	float balance;
	
	public static void main(String[] args) {
		
		double loanInterestRate= 7.5;
		System.out.println(loanInterestRate);
		
		System.out.println(BankAccount.bankName);
		BankAccount bankAccount= new BankAccount();
		//bankAccount.accountHoldersName= "Alonso";
		//bankAccount.accountNumber = "12345+";
		//bankAccount.balance = 2000f;
		System.out.println(bankAccount.balance);
	}

}
