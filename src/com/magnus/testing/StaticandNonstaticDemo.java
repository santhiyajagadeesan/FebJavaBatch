package com.magnus.testing;

public class StaticandNonstaticDemo {
	{
		System.out.println("this is instance block output");
	}
	
	static
	{
		System.out.println("this is static block output");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodVariable.m1();
	
//		System.out.println(MethodVariable.b);
		StaticandNonstaticDemo obj= new StaticandNonstaticDemo();
		
//		StaticandNonstaticDemo obj1= new StaticandNonstaticDemo();
		System.out.println("this is output from main method");
		
		
	}
	static class MethodVariable{
int a=30;
static int b =40;


static void m1() {
	
	MethodVariable mv=new MethodVariable();
	System.out.println("a="+mv.a);
	System.out.println("this is the display from static method");
}
void m2() {
	
	System.out.println("this is display from non static method");
}
}
}