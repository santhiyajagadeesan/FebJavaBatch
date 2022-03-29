package com.magnus.testing;

public class ConditionalDemo {

	public static void main(String[] args) {
		int age=17;
		if (age>18) {
			System.out.println("Eliglible for Voting");
		} else {
			System.out.println("  Eligible after " +(18-age)+ " years");
		}
	}

}
