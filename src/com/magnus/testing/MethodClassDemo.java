package com.magnus.testing;

public class MethodClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MethodDemo md=new  MethodDemo();
		int obj=md.addtwonumbers(20,40);
int object=md.subtwonumbers(40, 20);
System.out.println("subtraction of numbers is "+object );
	System.out.println("addition of two numbers is "+obj);
		boolean b=md.Evennumber(35);
	System.out.println(" the given number is " + b+" for even number");
	}

	}
class MethodDemo{
int addtwonumbers(int a,int b){
	int c=a+b;
	return c;
}
int subtwonumbers(int a,int b){
	int c=a-b;
	return c;
}
boolean Evennumber(int a){
	boolean c=a%2==0;
	return c;
}}
