package ControllerPackage;

import BankAccountPackage.BankAccount;

public class TransactionController {

	public void transferMoney(BankAccount bankAccountFrom, BankAccount bankAccountTo, String money){
		int amountOfMoneyFrom = Integer.parseInt(bankAccountFrom.getAmountOfMoney());
		int amountOfMoneyTo = Integer.parseInt(bankAccountTo.getAmountOfMoney());
		
		amountOfMoneyFrom -= Integer.parseInt(money);
		amountOfMoneyTo += Integer.parseInt(money);
		
		bankAccountFrom.setAmountOfMoney(String.valueOf(amountOfMoneyFrom));
		bankAccountTo.setAmountOfMoney(String.valueOf(amountOfMoneyTo));
		
	}
	
	public void withdrawMoney(BankAccount bankAccount, String money ){
		int amountOfMoney = Integer.parseInt(bankAccount.getAmountOfMoney());
		amountOfMoney -= Integer.parseInt(money);
		bankAccount.setAmountOfMoney(String.valueOf(amountOfMoney));
	}
	
	public void depositMoney(BankAccount bankAccount, String money ){
		int amountOfMoney = Integer.parseInt(bankAccount.getAmountOfMoney());
		amountOfMoney += Integer.parseInt(money);
		bankAccount.setAmountOfMoney(String.valueOf(amountOfMoney));
	}


	
}
