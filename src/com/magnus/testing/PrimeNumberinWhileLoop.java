package com.magnus.testing;

public class PrimeNumberinWhileLoop {

	public static void main(String[] args) {
		int i=1;
		do {
			//System.out.println(i);
			if (i%2==0) {
				//System.out.println("Not Prime:"+i);
			}
			else if (i%3==0) {
				//System.out.println("Not Prime:"+i);
			}
		else if (i%5==0) {
				//System.out.println("Not Prime:"+i);
			}
		else if (i%7==0) {
				//System.out.println("Not Prime:"+i);
			}
			else {
				System.out.println("Is Prime:"+i);
			}
			i++;
			
		}while(i<100)	;
		
	}
}
	
	
