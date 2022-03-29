package com.finalKeyword;

public class FinalKeywordDemo {
final int a;
static final int c;
 {
a=90;
System.out.println("hello");
}
static {
	 c=90;
	 System.out.println("bye");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeywordDemo fd= new FinalKeywordDemo();
			
	}

}
class A{
	final void display() {
		System.out.println("A:display method");
	}
}
 final class B extends A{
	 void show() {
		 super.display();
		 System.out.println("B:display method"); 
	 }
 }