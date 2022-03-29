package com.magnus.testing;

public class ConditionalelseifDemo {

	public static void main(String[] args) {
		int a=35;
		int b=45;
		int c=15;
		int d=25;
		if(a>b && a>c) {
System.out.println("A is greater number");
	}
		else if(b>c && b>d) {
			System.out.println("B is greater number");
	
		}
		else if (d>c && b>d) {
			System.out.println("D is greater number");
		}
		
		else {
			System.out.println("C is greater number");
		}
}
}