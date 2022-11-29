package BankPackage;

import java.util.List;

import BankSystemPackage.BankingSystem;
import MemberPackage.Member;

public class Bank {

	private String bankName;
	private String bankPhoneNumber;
	private String bankEmail;
	private String centerCityOfManagement;
	private String bankingSystemName;
	private List<Member> memberList;
	
	public Bank() {
		this.bankName = "";
		this.bankPhoneNumber = "";
		this.bankEmail = "";
		this.centerCityOfManagement = "";
		this.bankingSystemName = null;
		this.memberList = null;
	}
	
	
	public Bank(String bankName, String bankPhoneNumber, String bankEmail, String centerCityOfManagement,
			BankingSystem bankingSystem, List<Member> memberList) {
		this.bankName = bankName;
		this.bankPhoneNumber = bankPhoneNumber;
		this.bankEmail = bankEmail;
		this.centerCityOfManagement = centerCityOfManagement;
		this.bankingSystemName = bankingSystem.getBankingSystemName();
		this.memberList = memberList;
	}
	
	
	public Bank(Bank bank) {
		this.bankName = bank.bankName;
		this.bankPhoneNumber = bank.bankPhoneNumber;
		this.bankEmail = bank.bankEmail;
		this.centerCityOfManagement = bank.centerCityOfManagement;
		this.bankingSystemName = bank.bankingSystemName;
		this.memberList = bank.memberList;
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


	public String getBankingSystemName() {
		return bankingSystemName;
	}
	
}
