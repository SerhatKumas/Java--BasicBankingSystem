package ControllerPackage;

import java.util.List;

import BankPackage.Bank;
import BankSystemPackage.BankingSystem;

public class BankController {
	
	public Bank getBankByName(BankingSystem bankingSystem, String name) {
		List<Bank> bankList = bankingSystem.getBankList();
		Bank returningBank = null;
		for(Bank bank : bankList) if(bank.getBankName().equals(name)) printBank(returningBank);
		return returningBank;
	}
	
	public void displayBank(Bank bank) {
		printBank(bank);
	}

	public void displayAllBanks(BankingSystem bankingSystem) {
		List<Bank> bankList = bankingSystem.getBankList();
		for(Bank bank : bankList) printBank(bank);
	}
	
	public void displayBankByName(BankingSystem bankingSystem, String name) {
		List<Bank> bankList = bankingSystem.getBankList();
		Bank displayBank = null;
		for(Bank bank : bankList) if(bank.getBankName().equals(name)) printBank(displayBank);
	}
	
	public void addBank(BankingSystem bankingSystem, Bank bank) {
		List<Bank> bankList = bankingSystem.getBankList();
		bankList.add(bank);
		bankingSystem.setBankList(bankList);
	}
	
	public void deleteBank(BankingSystem bankingSystem, Bank bank) {
		List<Bank> bankList = bankingSystem.getBankList();
		boolean isRemoved = bankList.remove(bank);
		if(isRemoved) bankingSystem.setBankList(bankList);
	}
	
	public void deleteBankByName(BankingSystem bankingSystem, String name) {
		List<Bank> bankList = bankingSystem.getBankList();
		Bank deletingBank = null;
		for(Bank bank : bankList) if(bank.getBankName().equals(name)) deletingBank = bank;
		boolean isRemoved = bankList.remove(deletingBank);
		if(isRemoved) bankingSystem.setBankList(bankList);
	}
	
	private void printBank(Bank bank) {
		System.out.println("Bank Name : " + bank.getBankName() + "\n"
				+ "Bank Phone Number : " + bank.getBankPhoneNumber() + "\n"
						+ "Bank Email : " + bank.getBankEmail() + "\n"
								+ "City That Management Of Bank Placed In : " + bank.getCenterCityOfManagement() + "\n"
										+ "Banking System Name That Bank In : " + bank.getBankingSystemName() + "\n"
												+ "Number Of Member : " + bank.getMemberList().size() + "\n");
	}
	
}
