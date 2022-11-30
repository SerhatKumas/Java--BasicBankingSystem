package ControllerPackage;

import java.time.LocalDate;
import java.util.List;

import BankAccountPackage.*;
import MemberPackage.Member;

public class BankAccountController {
	
	public BankAccount getBankAccountByAccountNumber(Member member, String accountNumber) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		BankAccount returningBankAccount = null;
		for(BankAccount bankAccount : bankAccountList) if(bankAccount.getAccountNumber().equals(accountNumber)) returningBankAccount = bankAccount;
		return returningBankAccount;
	}
	
	public void displayBankAccount(BankAccount bankAccount) {
		printBankAccount(bankAccount);
	}

	public void displayAllTheBankAccounts(Member member) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		for(BankAccount bankAccount: bankAccountList) printBankAccount(bankAccount);
	}
	
	public void displaySavingAccounts(Member member) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		for(BankAccount bankAccount: bankAccountList) if(bankAccount.getClass().equals(new SavingAccount().getClass())) printBankAccount(bankAccount);
	}
	
	public void displaySalaryAccounts(Member member) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		for(BankAccount bankAccount: bankAccountList) if(bankAccount.getClass().equals(new SalaryAccount().getClass())) printBankAccount(bankAccount);
	}	
	
	public void displayChequeAccounts(Member member) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		for(BankAccount bankAccount: bankAccountList) if(bankAccount.getClass().equals(new ChequeAccount().getClass())) printBankAccount(bankAccount);
	}
	
	public void addBankAccount(Member member, BankAccount bankAccount) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		bankAccountList.add(bankAccount);
		member.setBankAccountList(bankAccountList);
	}
	
	public void deleteBankAccount(Member member, BankAccount bankAccount) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		boolean isRemoved = bankAccountList.remove(bankAccount);
		if(isRemoved) member.setBankAccountList(bankAccountList);
	}
	
	public void deleteBankAccountByAccountNumber(Member member, String accountNumber) {
		List <BankAccount> bankAccountList = member.getBankAccountList();
		BankAccount deletingBankAccount = null;
		for(BankAccount bankAccount : bankAccountList) if(bankAccount.getAccountNumber().equals(accountNumber)) deletingBankAccount = bankAccount;
		boolean isRemoved = bankAccountList.remove(deletingBankAccount);
		if(isRemoved) member.setBankAccountList(bankAccountList);
	}
	
	public BankAccount createBankAccount(String accountType, String accountNumber, String amountOfMoney, String formalPuposeOfAccount, String dailyWithdrawalLimit,
			LocalDate accountOpeningDate, LocalDate accountClosingDate) {
		return new BankAccount(accountType, accountNumber, amountOfMoney, formalPuposeOfAccount, dailyWithdrawalLimit,
				accountOpeningDate, accountClosingDate);
	}
	
	private void printBankAccount(BankAccount bankAccount) {
		System.out.println("Bank Account Type : " + bankAccount.getAccountType() + "\n"
				+ "Bank Account Number : " + bankAccount.getAccountNumber() + "\n"
						+ "Amount Of The Money : " + bankAccount.getAmountOfMoney() + "\n"
								+ "Bank Account Purpose : " + bankAccount.getFormalPuposeOfAccount() + "\n"
										+ "Bank Account Daily Witdrawal Limit : " + bankAccount.getDailyWithdrawalLimit() + "\n"
												+ "Bank Account Opening Date : " + bankAccount.getAccountOpeningDate() + "\n"
														+ "Bank Account Closing Date : " + bankAccount.getAccountClosingDate() +"\n");
	}
	
}
