package com.magnus.testing;

public class DemoThis {
	DemoThis(){
		this(10);
		System.out.println("0 argument method");

	}
	

	DemoThis(int a){
		this(20, 30);
		System.out.println("1 argument method");
	}
	
	DemoThis(int a,int b){
		this(10, 20, 30);
		System.out.println("2 argument method");
	
	}
	DemoThis(int a,int b,int c){
		System.out.println("3 argument method");
	}
	
	public static void main(String[] args) {
		DemoThis dt = new DemoThis()	;
		dt.displayA3();
	}

	void displayA1() {
		
	System.out.println("this is display from A1 method");
}


void  displayA2() {
	
	
	
	System.out.println("this is display from A2 method");
	}	


void displayA3 (){
	this.displayA1();
	this.displayA2();
	System.out.println("this is display from A3 method");
	}	
}

