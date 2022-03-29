package com.magnus.testing;

public class ClassInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	B obj=  new B();
		obj.addition();
		obj.Sub();
		C obj1=new C();
		obj1.Multiply();
		obj1.Sub();
	}	
	}
	class A{
		int a=10;
		int b=90;
	int addition() {
			int c=a+b;
		
		System.out.println("c"+c);
return c;
		}
	}
class B extends A{
	int H=100;
	int I=90;
public	int Sub() {
		int G=H-I;
	
	System.out.println("G"+G);
return G;
	}
}
class C extends B{
	int K=150;
	int L=15;
public	int Multiply() {
		int R=K*L;
	
	System.out.println("R"+R);
return R;
	}
	
	
}
