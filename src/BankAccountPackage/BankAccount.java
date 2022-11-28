package BankAccountPackage;

import java.time.LocalDateTime;

public class BankAccount {
	
	private String accountType;
	private String accountNumber;
	private String amountOfMoney;
	private String formalPuposeOfAccount;
	private String dailyWithdrawalLimit;
	private LocalDateTime accountOpeningDate;
	private LocalDateTime accountClosingDate;
	
	public BankAccount() {
		this.accountType = "";
		this.accountNumber = "";
		this.amountOfMoney = "";
		this.formalPuposeOfAccount = "";
		this.dailyWithdrawalLimit = "";
		this.accountOpeningDate = null;
		this.accountClosingDate = null;
	}
	
	public BankAccount(String accountType, String accountNumber, String amountOfMoney, String formalPuposeOfAccount, String dailyWithdrawalLimit,
			LocalDateTime accountOpeningDate, LocalDateTime accountClosingDate) {
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.amountOfMoney = amountOfMoney;
		this.formalPuposeOfAccount = formalPuposeOfAccount;
		this.dailyWithdrawalLimit = dailyWithdrawalLimit;
		this.accountOpeningDate = accountOpeningDate;
		this.accountClosingDate = accountClosingDate;
	}

	public BankAccount(BankAccount bankAccount) {
		this.accountType = bankAccount.accountType;
		this.accountNumber = bankAccount.accountNumber;
		this.amountOfMoney = bankAccount.amountOfMoney;
		this.formalPuposeOfAccount = bankAccount.formalPuposeOfAccount;
		this.dailyWithdrawalLimit = bankAccount.dailyWithdrawalLimit;
		this.accountOpeningDate = bankAccount.accountOpeningDate;
		this.accountClosingDate = bankAccount.accountClosingDate;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAmountOfMoney() {
		return amountOfMoney;
	}

	public String getFormalPuposeOfAccount() {
		return formalPuposeOfAccount;
	}
	
	public String getDailyWithdrawalLimit() {
		return dailyWithdrawalLimit;
	}

	public LocalDateTime getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public LocalDateTime getAccountClosingDate() {
		return accountClosingDate;
	}

	public void setAccountClosingDate(LocalDateTime accountClosingDate) {
		this.accountClosingDate = accountClosingDate;
	}
	
}
