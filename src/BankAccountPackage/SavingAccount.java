package BankAccountPackage;

import java.time.LocalDate;

public class SavingAccount extends BankAccount {

	//Empty constructor
	public SavingAccount() {
		super();
	}
	
	//Copy constructor
	public SavingAccount(SavingAccount savingAccount) {
		super(savingAccount);
	}

	//Full property constructor
	public SavingAccount(String accountNumber, String amountOfMoney, LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		super("Saving Account", accountNumber, amountOfMoney, "Saving money for determined time", "10000", accountOpeningDate,accountClosingDate);

	}
	
}
