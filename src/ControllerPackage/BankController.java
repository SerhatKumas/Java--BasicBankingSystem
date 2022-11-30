package ControllerPackage;

import java.util.List;

import BankPackage.Bank;
import BankSystemPackage.BankingSystem;
import MemberPackage.Member;

public class BankController {
	
	//Bank System can get bank by bank name
	public Bank getBankByName(BankingSystem bankingSystem, String name) {
		List<Bank> bankList = bankingSystem.getBankList();
		Bank returningBank = null;
		for(Bank bank : bankList) if(bank.getBankName().equals(name)) printBank(returningBank);
		return returningBank;
	}
	
	//Bank System can display bank by bank object
	public void displayBank(Bank bank) {
		printBank(bank);
	}

	//Bank System can display all bank
	public void displayAllBanks(BankingSystem bankingSystem) {
		List<Bank> bankList = bankingSystem.getBankList();
		for(Bank bank : bankList) printBank(bank);
	}
	
	//Bank System can display bank by bank name
	public void displayBankByName(BankingSystem bankingSystem, String name) {
		List<Bank> bankList = bankingSystem.getBankList();
		Bank displayBank = null;
		for(Bank bank : bankList) if(bank.getBankName().equals(name)) printBank(displayBank);
	}
	
	//Bank System can add bank by bank object
	public void addBank(BankingSystem bankingSystem, Bank bank) {
		List<Bank> bankList = bankingSystem.getBankList();
		bankList.add(bank);
		bankingSystem.setBankList(bankList);
	}
	
	//Bank System can delete bank by bank object
	public void deleteBank(BankingSystem bankingSystem, Bank bank) {
		List<Bank> bankList = bankingSystem.getBankList();
		boolean isRemoved = bankList.remove(bank);
		if(isRemoved) bankingSystem.setBankList(bankList);
	}
	
	//Bank System can delete bank by bank name
	public void deleteBankByName(BankingSystem bankingSystem, String name) {
		List<Bank> bankList = bankingSystem.getBankList();
		Bank deletingBank = null;
		for(Bank bank : bankList) if(bank.getBankName().equals(name)) deletingBank = bank;
		boolean isRemoved = bankList.remove(deletingBank);
		if(isRemoved) bankingSystem.setBankList(bankList);
	}
	
	//Bank System can create bank
	public Bank createBank(String bankName, String bankPhoneNumber, String bankEmail, String centerCityOfManagement,
			BankingSystem bankingSystem, List<Member> memberList, TransactionController transactionController, MemberController memberController, BankAccountController bankAccountController) {
		return new Bank(bankName, bankPhoneNumber, bankEmail, centerCityOfManagement, bankingSystem, memberList, transactionController,memberController, bankAccountController);
	}
	
	//Bank System can print bank by bank object
	private void printBank(Bank bank) {
		System.out.println("Bank Name : " + bank.getBankName() + "\n"
				+ "Bank Phone Number : " + bank.getBankPhoneNumber() + "\n"
						+ "Bank Email : " + bank.getBankEmail() + "\n"
								+ "City That Management Of Bank Placed In : " + bank.getCenterCityOfManagement() + "\n"
										+ "Banking System Name That Bank In : " + bank.getBankingSystem().getBankingSystemName() + "\n"
												+ "Number Of Member : " + bank.getMemberList().size() + "\n");
	}
	
}
