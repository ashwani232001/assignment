package oops;
abstract class BankAccount{//abstract class
int account;//instance variable
int balance=30000;

abstract void deposite();//abstract method
abstract void withdraw();//abstract method
}

public class CheckingAccount extends BankAccount {//child class
void deposite() {//implement parent class abstract method
	account=101;
	int deposite=1000+balance;
	System.out.println("account no.:"+account);
	System.out.println("previous balance:"+balance);
	System.out.println("deposite balance is:"+deposite);
}
void withdraw() {//implement the parent class abstract method
	account=102;
	int withdraw=balance-1000;
	System.out.println("account no.:"+account);
	System.out.println("previous balance:"+balance);
	System.out.println("withdraw balance is:"+withdraw);
}
	public static void main(String[] args) {//main method
		CheckingAccount ca= new CheckingAccount();//object of child class
	ca.deposite();
	ca.withdraw();
}
}
