package BankAccountPackage;

import java.time.LocalDate;

public class ChequeAccount extends BankAccount {

	public ChequeAccount() {
		super();
	}

	public ChequeAccount(ChequeAccount chequeAccount) {
		super(chequeAccount);
	}

	public ChequeAccount(String accountNumber, String amountOfMoney, LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		super("Cheque Account", accountNumber, amountOfMoney, "Cheque deposit or withdrawal", "5000", accountOpeningDate,accountClosingDate);

	}
	
}
