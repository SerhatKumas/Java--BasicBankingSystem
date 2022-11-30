package BankAccountPackage;

import java.time.LocalDate;

public class SalaryAccount extends BankAccount {
	
	public SalaryAccount() {
		super();
	}

	public SalaryAccount(SalaryAccount salaryAccount) {
		super(salaryAccount);
	}

	public SalaryAccount(String accountNumber, String amountOfMoney, LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		super("Salary Account", accountNumber, amountOfMoney, "Salary deposit by companies", "20000", accountOpeningDate,accountClosingDate);

	}
}
