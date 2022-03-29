package com.magnus.testing;



public class HieerachialInheritanceDemo {

	public static void main(String[] args) {
		kid k=new kid();
k.A1();
k.A2();
kid1 k1=new kid1();
k1.A3();
	}
}


class mom{
	void A1() {
		System.out.println("this is parent class");
	}
}

class kid extends mom{
	void A2() {
		System.out.println("this is child1 class");
	}
}
class kid1 extends mom{
	void A3() {
		System.out.println("this is child2 class");
	}
}
