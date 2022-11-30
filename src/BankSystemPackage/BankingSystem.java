package BankSystemPackage;

import java.util.List;

import BankPackage.Bank;
import ControllerPackage.BankController;

public class BankingSystem {
	
	//Properties of Banking System
	private String bankingSystemName;
	private String centralBankName;
	private String countryName;
	private String countryCode;
	private List<Bank> bankList;
	private BankController bankController;
	
	//Empty constructor
	public BankingSystem() {
		bankingSystemName = "" ;
		this.centralBankName = "";
		this.countryName = "";
		this.countryCode = "";
		this.bankList = null;
		this.bankController = null;
	}
	
	//Full property constructor
	public BankingSystem(String bankingSystemName, String centralBankName, String countryName, String countryCode, List<Bank> bankList, BankController bankController) {
		this.bankingSystemName = bankingSystemName;
		this.centralBankName = centralBankName;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.bankList = bankList;
		this.bankController = bankController;
	}
	
	//Copy constructor
	public BankingSystem(BankingSystem bankingSystem) {
		this.bankingSystemName = bankingSystem.bankingSystemName;
		this.centralBankName = bankingSystem.centralBankName;
		this.countryName = bankingSystem.countryName;
		this.countryCode = bankingSystem.countryCode;
		this.bankList = bankingSystem.bankList;
		this.bankController = bankingSystem.bankController;
	}

	//Getter setter methods
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

	public BankController getBankController() {
		return bankController;
	}
	
}
