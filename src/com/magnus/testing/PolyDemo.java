package com.magnus.testing;

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyDemo pd= new PolyDemo();
		System.out.println(pd.add(10, 30));
		System.out.println(pd.add(10,30,40));
		System.out.println(pd.add(10, 30,40,90));
		System.out.println(pd.add(10.9f, 30.8f));
	}
int add(int a,int b) {
return(a+b);
}
int add(int a,int b,int c) {
	return(a+b+c);
}
int add(int a,int b,int c,int d) {
	return(a+b+c+d);
}
float add(float g,float h) {
	return(g+h);
}
}