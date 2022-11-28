package BankAccountPackage;

import java.time.LocalDateTime;

public class ChequeAccount extends BankAccount {

	public ChequeAccount() {
		super();
	}

	public ChequeAccount(ChequeAccount chequeAccount) {
		super(chequeAccount);
	}

	public ChequeAccount(String accountNumber, String amountOfMoney, String dailyWithdrawalLimit, LocalDateTime accountOpeningDate, LocalDateTime accountClosingDate) {
		super("Cheque Account", accountNumber, amountOfMoney, "Cheque deposit or withdrawal", dailyWithdrawalLimit, accountOpeningDate,accountClosingDate);

	}
	
}
