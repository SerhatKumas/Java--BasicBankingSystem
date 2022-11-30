package BankAccountPackage;

import java.time.LocalDate;

public class SalaryAccount extends BankAccount {
	
	//Empty constructor
	public SalaryAccount() {
		super();
	}
	
	//Copy constructor
	public SalaryAccount(SalaryAccount salaryAccount) {
		super(salaryAccount);
	}

	//Full property constructor
	public SalaryAccount(String accountNumber, String amountOfMoney, LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		super("Salary Account", accountNumber, amountOfMoney, "Salary deposit by companies", "20000", accountOpeningDate,accountClosingDate);

	}
}
