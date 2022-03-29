package com.magnus.testing;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login Bank=new Login();
		Bank.loginApp();
		System.out.println("..........................................");
		 NewLogin Bank1=new  NewLogin();
		 Bank1.loginApp();
	}

}
class Login{
	
	void loginApp(){
		System.out.println("Enter the Username ");
		System.out.println("Enter the Password ");
		System.out.println("Click the Submit ");
		
	}
}
class NewLogin extends Login{
	void loginApp() {
		System.out.println("Enter the Username ");
		System.out.println("Enter the Password ");
		System.out.println("Enter the Mobile number");
		System.out.println("Click the Submit ");
	}
}