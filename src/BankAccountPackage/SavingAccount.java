package BankAccountPackage;

import java.time.LocalDate;

public class SavingAccount extends BankAccount {

	public SavingAccount() {
		super();
	}

	public SavingAccount(SavingAccount savingAccount) {
		super(savingAccount);
	}

	public SavingAccount(String accountNumber, String amountOfMoney, LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		super("Saving Account", accountNumber, amountOfMoney, "Saving money for determined time", "10000", accountOpeningDate,accountClosingDate);

	}
	
}
