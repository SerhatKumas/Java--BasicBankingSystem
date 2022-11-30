package MemberPackage;

import java.util.List;

import BankAccountPackage.BankAccount;
import ControllerPackage.BankAccountController;
import ControllerPackage.TransactionController;

public class Member extends Person {
	
	//Properties of member
	private String jobTitle;
	private String memberNumber;
	private List<BankAccount> bankAccountList;
	private TransactionController transactionController;
	private BankAccountController bankAccountController;
	
	//Empty constructor 
	public Member() {
		super();
		this.jobTitle = "";
		this.memberNumber = "";
		this.bankAccountList = null;
		this.transactionController = null;
		this.bankAccountController = null;
	}

	//Full-parameter constructor 
	public Member(String idNumber, String name, String surname, String email, String phoneNumber, String jobTitle, String memberNumber, List<BankAccount> bankAccountList, TransactionController transactionController, BankAccountController bankAccountController) {
		super(idNumber, name, surname, email, phoneNumber);
		this.jobTitle = jobTitle;
		this.memberNumber = memberNumber;
		this.bankAccountList = bankAccountList;
		this.transactionController = transactionController;
		this.bankAccountController = bankAccountController;
	}
	
	//Copy constructor 
	public Member(Member member) {
		super(member);
		this.jobTitle = member.jobTitle;
		this.memberNumber = member.memberNumber;
		this.bankAccountList = member.bankAccountList;
		this.transactionController = member.transactionController;
		this.bankAccountController = member.bankAccountController;
	}

	//Setter getter methods
	public String getJobTitle() {
		return jobTitle;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public List<BankAccount> getBankAccountList() {
		return bankAccountList;
	}
	
	public void setBankAccountList(List<BankAccount> bankAccountList) {
		this.bankAccountList = bankAccountList;
	}

	public TransactionController getTransactionController() {
		return transactionController;
	}

	public BankAccountController getBankAccountController() {
		return bankAccountController;
	}
	
}
