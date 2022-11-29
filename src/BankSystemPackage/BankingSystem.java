package BankSystemPackage;

import java.util.List;

import BankPackage.Bank;

public class BankingSystem {
	
	private String bankingSystemName;
	private String centralBankName;
	private String countryName;
	private String countryCode;
	private List<Bank> bankList;
	
	public BankingSystem() {
		bankingSystemName = "" ;
		this.centralBankName = "";
		this.countryName = "";
		this.countryCode = "";
		this.bankList = null;
	}
	
	public BankingSystem(String bankingSystemName, String centralBankName, String countryName, String countryCode, List<Bank> bankList) {
		this.bankingSystemName = bankingSystemName;
		this.centralBankName = centralBankName;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.bankList = bankList;
	}
	
	
	public BankingSystem(BankingSystem bankingSystem) {
		this.bankingSystemName = bankingSystem.bankingSystemName;
		this.centralBankName = bankingSystem.centralBankName;
		this.countryName = bankingSystem.countryName;
		this.countryCode = bankingSystem.countryCode;
		this.bankList = bankingSystem.bankList;
	}

	public List<Bank> getBankList() {
		return bankList;
	}

	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
	}
	
	public String getBankingSystemName() {
		return bankingSystemName;
	}

	public String getCentralBankName() {
		return centralBankName;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}
	
}
