package BankAccountPackage;

import java.time.LocalDateTime;

public class SalaryAccount extends BankAccount {
	
	public SalaryAccount() {
		super();
	}

	public SalaryAccount(SalaryAccount salaryAccount) {
		super(salaryAccount);
	}

	public SalaryAccount(String accountNumber, String amountOfMoney, String dailyWithdrawalLimit, LocalDateTime accountOpeningDate, LocalDateTime accountClosingDate) {
		super("Salary Account", accountNumber, amountOfMoney, "Salary deposit by companies", dailyWithdrawalLimit, accountOpeningDate,accountClosingDate);

	}
}
