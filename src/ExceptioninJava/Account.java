package ExceptioninJava;

public class Account {
	int balance=55000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a=new Account();
a.withdraw(60000);
	}


void withdraw(int amount){
	
	
	if(balance>amount) {
		balance=balance-amount;
		System.out.println("Tranction Done");
	}else {
		throw new AccountBalanceLow("account balance is low");
	}
		
	}
}
