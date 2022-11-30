package BankAccountPackage;

import java.time.LocalDate;

public class BankAccount {
	
	//Bank of Account properties
	private String accountType;
	private String accountNumber;
	private String amountOfMoney;
	private String formalPuposeOfAccount;
	private String dailyWithdrawalLimit;
	private LocalDate accountOpeningDate;
	private LocalDate accountClosingDate;
	
	//Empty constructor
	public BankAccount() {
		this.accountType = "";
		this.accountNumber = "";
		this.amountOfMoney = "";
		this.formalPuposeOfAccount = "";
		this.dailyWithdrawalLimit = "";
		this.accountOpeningDate = null;
		this.accountClosingDate = null;
	}
	
	//Full property constructor
	public BankAccount(String accountType, String accountNumber, String amountOfMoney, String formalPuposeOfAccount, String dailyWithdrawalLimit,
			LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.amountOfMoney = amountOfMoney;
		this.formalPuposeOfAccount = formalPuposeOfAccount;
		this.dailyWithdrawalLimit = dailyWithdrawalLimit;
		this.accountOpeningDate = accountOpeningDate;
		this.accountClosingDate = accountClosingDate;
	}

	//Copy constructor
	public BankAccount(BankAccount bankAccount) {
		this.accountType = bankAccount.accountType;
		this.accountNumber = bankAccount.accountNumber;
		this.amountOfMoney = bankAccount.amountOfMoney;
		this.formalPuposeOfAccount = bankAccount.formalPuposeOfAccount;
		this.dailyWithdrawalLimit = bankAccount.dailyWithdrawalLimit;
		this.accountOpeningDate = bankAccount.accountOpeningDate;
		this.accountClosingDate = bankAccount.accountClosingDate;
	}
	
	//Setter getter methods
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

	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public LocalDate getAccountClosingDate() {
		return accountClosingDate;
	}

	public void setAccountClosingDate(LocalDate accountClosingDate) {
		this.accountClosingDate = accountClosingDate;
	}

	public void setAmountOfMoney(String amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}
	
	
}
