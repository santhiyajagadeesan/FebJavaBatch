package com.magnus.testing;

public class PatternLoopReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalrow=10;
		for(int row=totalrow;row>=1;row--){
			for(int sp=totalrow; sp>row;sp--) {
				System.out.print(" ");
			}
			for(int st=1; st<=row;st++){
			System.out.print("*");
	}
			System.out.println();	
}
}
	}


