package com.magnus.testing;

public class ConstructorInJava {
ConstructorInJava(){
	
	System.out.println("this is no arg constructor");
}
ConstructorInJava(int a){
	
	System.out.println("this is one arg constructor is= " +a);
}
ConstructorInJava(int a,int b){
	
	System.out.println("this is two arg constructor is =" +a +b);
}
ConstructorInJava(int a,int b,int c){
	
	System.out.println("this is three arg constructor is =" +a+b+c);
}
	public static void main(String[] args) {
		ConstructorInJava c= new ConstructorInJava();
		ConstructorInJava c1= new ConstructorInJava(20);
		ConstructorInJava c2= new ConstructorInJava(20,90);
		ConstructorInJava c3= new ConstructorInJava(20,90,87);
	}

}
