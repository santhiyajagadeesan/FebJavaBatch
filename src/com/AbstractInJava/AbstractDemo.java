package com.AbstractInJava;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.display();
b.show();
b.print();
	}

}
abstract class A{
	A(){
	
	System.out.println("this is constructor method");	
	}
  void display() {
		System.out.println("this is display method");
	}
	abstract void show();
	abstract void print();
}	
class B extends A{
	void show(){
	System.out.println("this is show method");	
	}
	void print(){
		System.out.println("this is print method");	
		}
}