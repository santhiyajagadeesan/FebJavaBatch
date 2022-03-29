package com.superkeyword;

public class SuperKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B b=new B();
//b.diplay();
		E e=new E();
	}

}
//class A{
//	int a=50;
//	void display() {
//		System.out.println("A method");
//	}
//}
//class B extends A{
//	int a=50;
//	void display() {
//		System.out.println("B method");
//	}
//	void diplay() {
//		super.display();
//		System.out.println(super.a);
//		System.out.println("Display  method");
//	}
//}
class C {
	C(){
		System.out.println("0 arg constructor");
	}
	C(int c){
		System.out.println("1 arg constructor");
	}
}
class D extends  C {
	D(){
		System.out.println("0 arg constructor");
	}
	D(int d){
		super(98);
		System.out.println("1 arg constructor");
	}	
}
class E extends D{
	E(){
		super(90);
		System.out.println("0 arg constructor");
	}	
}