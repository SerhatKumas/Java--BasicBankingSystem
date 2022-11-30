package ControllerPackage;

import java.util.List;

import BankAccountPackage.BankAccount;
import BankPackage.Bank;
import MemberPackage.Member;

public class MemberController {
	//Bank can get user as an object
	public Member getMemberByName(Bank bank, String name) {
		List <Member> memberList = bank.getMemberList();
		Member returningMember = null;
		for(Member member : memberList) if(member.getName().equals(name)) returningMember = member ;
		return returningMember;
	}
	
	//Bank can display member by member object
	public void displayMember(Member member) {
		printMember(member);
	}
	
	//Bank can display all member
	public void displayAllMembers(Bank bank) {
		List <Member> memberList = bank.getMemberList();
		for(Member member: memberList) printMember(member);
	}
	
	//Bank can display member by member name
	public void displayMemberByName(Bank bank, String name) {
		List <Member> memberList = bank.getMemberList();
		for(Member member : memberList) if(member.getName().equals(name)) printMember(member) ;
	}
	
	//Bank can display member by member number
	public void displayMemberByMemberNumber(Bank bank, String memberNumber) {
		List <Member> memberList = bank.getMemberList();
		for(Member member : memberList) if(member.getMemberNumber().equals(memberNumber)) printMember(member) ;
	}
	
	//Bank can add member by member object
	public void addMember(Bank bank, Member member) {
		List <Member> memberList = bank.getMemberList();
		memberList.add(member);
		bank.setMemberList(memberList);
	}
	
	//Bank can delete member by member object
	public void deleteMember(Bank bank, Member member) {
		List <Member> memberList = bank.getMemberList();
		boolean isRemoved = memberList.remove(member);
		if(isRemoved) bank.setMemberList(memberList);
	}
	
	//Bank can delete member by member name
	public void deleteMemberByName(Bank bank, String name) {
		List <Member> memberList = bank.getMemberList();
		Member deletingMember = null;
		for(Member member : memberList) if(member.getName().equals(name)) deletingMember = member;
		boolean isRemoved = memberList.remove(deletingMember);
		if(isRemoved) bank.setMemberList(memberList);
	}
	
	//Bank can delete member by member number
	public void deleteMemberByMemberNumber(Bank bank, String memberNumber) {
		List <Member> memberList = bank.getMemberList();
		Member deletingMember = null;
		for(Member member : memberList) if(member.getMemberNumber().equals(memberNumber)) deletingMember = member;
		boolean isRemoved = memberList.remove(deletingMember);
		if(isRemoved) bank.setMemberList(memberList);
	}
	
	//Bank can create member
	public Member createMember(String idNumber, String name, String surname, String email, String phoneNumber, String jobTitle, String memberNumber, List<BankAccount> bankAccountList, TransactionController transactionController, BankAccountController bankAccountController) {
		return new Member(idNumber, name, surname, email, phoneNumber, jobTitle, memberNumber, bankAccountList, transactionController, bankAccountController);
	}
	
	//Bank can display member by member object
	private void printMember(Member member) {
		System.out.println("Member Id Number : " + member.getIdNumber() + "\n"
				+ "Member Name : " + member.getName() + "\n"
						+ "Member Surname : " + member.getSurname() + "\n"
								+ "Member Email : " + member.getEmail() + "\n"
										+ "Member Phone Number : " + member.getPhoneNumber() + "\n"
												+ "Member Job Title : " + member.getJobTitle() + "\n"
														+ "Customer Number : " + member.getMemberNumber() + "\n"
																+ "Number Of Member Bank Account : " + member.getBankAccountList().size() + "\n");
	}
	
}
