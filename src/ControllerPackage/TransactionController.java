package ControllerPackage;

import BankAccountPackage.BankAccount;

public class TransactionController {

	//Money transfer method that takes 2 bank account as parameter
	//As bank account user can send its bank account or bank can send other's bank account
	public void transferMoney(BankAccount bankAccountFrom, BankAccount bankAccountTo, String money){
		int amountOfMoneyFrom = Integer.parseInt(bankAccountFrom.getAmountOfMoney());
		int amountOfMoneyTo = Integer.parseInt(bankAccountTo.getAmountOfMoney());
		
		amountOfMoneyFrom -= Integer.parseInt(money);
		amountOfMoneyTo += Integer.parseInt(money);
		
		bankAccountFrom.setAmountOfMoney(String.valueOf(amountOfMoneyFrom));
		bankAccountTo.setAmountOfMoney(String.valueOf(amountOfMoneyTo));
		
	}
	
	//Withdraw money method that takes bank account and money amount as parameter
	//As bank account user can send its bank account or bank can send other's bank account
	public void withdrawMoney(BankAccount bankAccount, String money ){
		int amountOfMoney = Integer.parseInt(bankAccount.getAmountOfMoney());
		amountOfMoney -= Integer.parseInt(money);
		bankAccount.setAmountOfMoney(String.valueOf(amountOfMoney));
	}
	
	//Deposit money method that takes 2 bank account as parameter
	//As bank account user can send its bank account or bank can send other's bank account
	public void depositMoney(BankAccount bankAccount, String money ){
		int amountOfMoney = Integer.parseInt(bankAccount.getAmountOfMoney());
		amountOfMoney += Integer.parseInt(money);
		bankAccount.setAmountOfMoney(String.valueOf(amountOfMoney));
	}


	
}
