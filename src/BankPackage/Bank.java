package BankPackage;

import java.util.List;

import BankSystemPackage.BankingSystem;
import ControllerPackage.BankAccountController;
import ControllerPackage.MemberController;
import ControllerPackage.TransactionController;
import MemberPackage.Member;

public class Bank {

	private String bankName;
	private String bankPhoneNumber;
	private String bankEmail;
	private String centerCityOfManagement;
	private BankingSystem bankingSystem;
	private List<Member> memberList;
	private MemberController memberController;
	private TransactionController transactionController;
	private BankAccountController bankAccountController;
	
	public Bank() {
		this.bankName = "";
		this.bankPhoneNumber = "";
		this.bankEmail = "";
		this.centerCityOfManagement = "";
		this.bankingSystem = null;
		this.memberList = null;
		this.memberController = null;
		this.transactionController = null;
		this.bankAccountController = null;
	}
	
	
	public Bank(String bankName, String bankPhoneNumber, String bankEmail, String centerCityOfManagement,
			BankingSystem bankingSystem, List<Member> memberList,TransactionController transactionController, MemberController memberController,BankAccountController bankAccountController) {
		this.bankName = bankName;
		this.bankPhoneNumber = bankPhoneNumber;
		this.bankEmail = bankEmail;
		this.centerCityOfManagement = centerCityOfManagement;
		this.bankingSystem = bankingSystem;
		this.memberList = memberList;
		this.memberController = memberController;
		this.transactionController = transactionController;
		this.bankAccountController = bankAccountController;
	}
	
	
	public Bank(Bank bank) {
		this.bankName = bank.bankName;
		this.bankPhoneNumber = bank.bankPhoneNumber;
		this.bankEmail = bank.bankEmail;
		this.centerCityOfManagement = bank.centerCityOfManagement;
		this.bankingSystem = bank.bankingSystem;
		this.memberList = bank.memberList;
		this.memberController = bank.memberController;
		this.transactionController = bank.transactionController;
		this.bankAccountController = bank.bankAccountController;
	}


	public List<Member> getMemberList() {
		return memberList;
	}


	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}


	public String getBankName() {
		return bankName;
	}


	public String getBankPhoneNumber() {
		return bankPhoneNumber;
	}


	public String getBankEmail() {
		return bankEmail;
	}


	public String getCenterCityOfManagement() {
		return centerCityOfManagement;
	}


	public BankingSystem getBankingSystem() {
		return bankingSystem;
	}


	public MemberController getMemberController() {
		return memberController;
	}


	public TransactionController getTransactionController() {
		return transactionController;
	}


	public BankAccountController getBankAccountController() {
		return bankAccountController;
	}
	
}
