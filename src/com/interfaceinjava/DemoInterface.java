package com.interfaceinjava;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D d=new D();
d.display();
d.show();
d.print();
d.organize();
	}

}
interface A{
	public void display();
	public void show();
	public void print();
}
interface B{
	public void display();
	public void show();
	public void print();
}
class C  implements A,B{
	
	 public void display() {
		System.out.println("Display method output");
	}
	 public void show() {
			System.out.println("show method output");
		} 
	 public void print() {
			System.out.println("print method output");
		} 
}
class D extends C implements B{
	void organize() {
		System.out.println("organize method");
	}
}