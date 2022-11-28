package BankAccountPackage;

import java.time.LocalDateTime;

public class SavingAccount extends BankAccount {

	public SavingAccount() {
		super();
	}

	public SavingAccount(SavingAccount savingAccount) {
		super(savingAccount);
	}

	public SavingAccount(String accountNumber, String amountOfMoney, String dailyWithdrawalLimit, LocalDateTime accountOpeningDate, LocalDateTime accountClosingDate) {
		super("Saving Account", accountNumber, amountOfMoney, "Saving money for determined time", dailyWithdrawalLimit, accountOpeningDate,accountClosingDate);

	}
	
}
