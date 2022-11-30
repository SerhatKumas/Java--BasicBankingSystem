package ManualTestPackage;

import java.time.LocalDate;

import java.util.LinkedList;

import BankAccountPackage.*;
import BankPackage.*;
import BankSystemPackage.*;
import ControllerPackage.*;
import MemberPackage.*;

public class TestCaseOne {

	public static void main(String[] args) {
		
		BankingSystem bankSystemTr = new BankingSystem("Turkish Market","Turkish Central Bank","Turkey","TR",new LinkedList<Bank>(), new BankController());
		BankingSystem bankSystemUS = new BankingSystem("American Market","American Central Bank","America","USA",new LinkedList<Bank>(), new BankController());
		
		Bank bankZiraat = new Bank("Ziraat Bank", "+0224 445 56 75", "help@ziraat.com", "Istanbul", bankSystemTr, new LinkedList<Member>(), new TransactionController(), new MemberController(), new BankAccountController());
		Bank bankIs = new Bank("Is Bank", "+0224 445 79 88", "help@isbank.com", "Ankara", bankSystemTr, new LinkedList<Member>(), new TransactionController(), new MemberController(), new BankAccountController());
		
		Bank bankOfAmerica = new Bank("Bank Of America", "+1 7564 456 56 75", "help@bankofamerica.com", "Washington", bankSystemUS, new LinkedList<Member>(), new TransactionController(), new MemberController(), new BankAccountController());
		Bank bankAmericanExpress = new Bank("American Express", "+1 7564 456 56 75", "help@bankofamerica.com", "Washington", bankSystemUS, new LinkedList<Member>(), new TransactionController(), new MemberController(), new BankAccountController());
		
		Member member1 = new Member("12345678910", "Kemal", "Yanardag", "kemal@gmail.com", "+90 554 458 8945", "Engineer", "1234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		Member member2 = new Member("22345678910", "Zeynep", "Ustagul", "zeynep@gmail.com", "+90 564 433 6490", "Designer", "2234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		
		Member member3 = new Member("32345678910", "Selin", "Baran", "selin@gmail.com", "+90 553 452 9045", "Lawyer", "3234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		Member member4 = new Member("42345678910", "Ali", "Er", "ali@gmail.com", "+90 564 421 6940", "Teacher", "4234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		
		Member member5 = new Member("12345678910", "Josh", "Thedore", "josh@gmail.com", "+1 554 458 8945", "Programmer", "5234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		Member member6 = new Member("22345678910", "Susan", "Perez", "susan@gmail.com", "+1 564 433 6490", "Chief", "6234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		
		Member member7 = new Member("32345678910", "Angelica", "Santiago", "angelica@gmail.com", "+1 553 452 9045", "Manager", "7234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		Member member8 = new Member("42345678910", "Jake", "Peralta", "jake@gmail.com", "+1 564 421 6940", "Ceo", "8234567891011", new LinkedList<BankAccount>(), new TransactionController(), new BankAccountController());
		
		ChequeAccount chequeAccount1 = new ChequeAccount("Chq123456", "10000", LocalDate.now(),null);
		ChequeAccount chequeAccount2 = new ChequeAccount("Chq223456", "23400", LocalDate.now(),null);
		ChequeAccount chequeAccount3 = new ChequeAccount("Chq323456", "15500", LocalDate.now(),null);
		ChequeAccount chequeAccount4 = new ChequeAccount("Chq423456", "100000", LocalDate.now(),null);
		ChequeAccount chequeAccount5 = new ChequeAccount("Chq523456", "336700", LocalDate.now(),null);
		ChequeAccount chequeAccount6 = new ChequeAccount("Chq623456", "212357", LocalDate.now(),null);
		ChequeAccount chequeAccount7 = new ChequeAccount("Chq723456", "10323000", LocalDate.now(),null);
		ChequeAccount chequeAccount8 = new ChequeAccount("Chq823456", "103244000", LocalDate.now(),null);

		SalaryAccount salaryAccount1 = new SalaryAccount("Slr123456", "2530000", LocalDate.now(),null);
		SalaryAccount salaryAccount2 = new SalaryAccount("Slr223456", "233200", LocalDate.now(),null);
		SalaryAccount salaryAccount3 = new SalaryAccount("Slr323456", "1500", LocalDate.now(),null);
		SalaryAccount salaryAccount4 = new SalaryAccount("Slr423456", "12000", LocalDate.now(),null);
		SalaryAccount salaryAccount5 = new SalaryAccount("Slr523456", "3300", LocalDate.now(),null);
		SalaryAccount salaryAccount6 = new SalaryAccount("Slr623456", "443264", LocalDate.now(),null);
		SalaryAccount salaryAccount7 = new SalaryAccount("Slr723456", "3447567", LocalDate.now(),null);
		SalaryAccount salaryAccount8 = new SalaryAccount("Slr823456", "434234757", LocalDate.now(),null);
		
		SavingAccount savingAccount1 = new SavingAccount("Svg123456", "2650000", LocalDate.now(),null);
		SavingAccount savingAccount2 = new SavingAccount("Svg223456", "14246", LocalDate.now(),null);
		SavingAccount savingAccount3 = new SavingAccount("Svg323456", "150230", LocalDate.now(),null);
		SavingAccount savingAccount4 = new SavingAccount("Svg423456", "42453", LocalDate.now(),null);
		SavingAccount savingAccount5 = new SavingAccount("Svg523456", "54664", LocalDate.now(),null);
		SavingAccount savingAccount6 = new SavingAccount("Svg623456", "64645629", LocalDate.now(),null);
		SavingAccount savingAccount7 = new SavingAccount("Svg723456", "75675967", LocalDate.now(),null);
		SavingAccount savingAccount8 = new SavingAccount("Svg823456", "3458692", LocalDate.now(),null);
		
		member1.getBankAccountList().add(chequeAccount1);
		member1.getBankAccountList().add(salaryAccount1);
		member1.getBankAccountList().add(savingAccount1);
		
		member2.getBankAccountList().add(chequeAccount2);
		member2.getBankAccountList().add(salaryAccount2);
		member2.getBankAccountList().add(savingAccount2);
		
		member3.getBankAccountList().add(chequeAccount3);
		member3.getBankAccountList().add(salaryAccount3);
		member3.getBankAccountList().add(savingAccount3);
		
		member4.getBankAccountList().add(chequeAccount4);
		member4.getBankAccountList().add(salaryAccount4);
		member4.getBankAccountList().add(savingAccount4);
		
		member5.getBankAccountList().add(chequeAccount5);
		member5.getBankAccountList().add(salaryAccount5);
		member5.getBankAccountList().add(savingAccount5);
		
		member6.getBankAccountList().add(chequeAccount6);
		member6.getBankAccountList().add(salaryAccount6);
		member6.getBankAccountList().add(savingAccount6);
		
		member7.getBankAccountList().add(chequeAccount7);
		member7.getBankAccountList().add(salaryAccount7);
		member7.getBankAccountList().add(savingAccount7);
		
		member8.getBankAccountList().add(chequeAccount8);
		member8.getBankAccountList().add(salaryAccount8);
		member8.getBankAccountList().add(savingAccount8);
		
		
		bankZiraat.getMemberList().add(member1);
		bankZiraat.getMemberList().add(member2);
		
		bankIs.getMemberList().add(member3);
		bankIs.getMemberList().add(member4);
		
		bankOfAmerica.getMemberList().add(member5);
		bankOfAmerica.getMemberList().add(member6);
		
		bankAmericanExpress.getMemberList().add(member7);
		bankAmericanExpress.getMemberList().add(member8);
		
		//--------------------------------------------------------- All Dummy Data Assignment ---------------------------------------------------------
		
		
		
	}
	
}
