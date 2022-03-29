package com.magnus.testing;

public class Conditional_SwitchDemo {

	public static void main(String[] args) {
		int a=100;
		int b=145;
		int c=250;
		int d=98;
		
int options =3;
switch(options) {
case 1:
System.out.println(d);
break;
case 2:
	System.out.println(a);	
	break;	
case 3:
System.out.println(c);
break;

case 4:
System.out.println(b);
break;
	
default	:
	System.out.println("End the switch condition");
	}

	}
}