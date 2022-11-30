package BankAccountPackage;

import java.time.LocalDate;

public class ChequeAccount extends BankAccount {

	//Empty constructor
	public ChequeAccount() {
		super();
	}
	
	//Copy constructor
	public ChequeAccount(ChequeAccount chequeAccount) {
		super(chequeAccount);
	}

	//FUll property constructor
	public ChequeAccount(String accountNumber, String amountOfMoney, LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		super("Cheque Account", accountNumber, amountOfMoney, "Cheque deposit or withdrawal", "5000", accountOpeningDate,accountClosingDate);

	}
	
}
