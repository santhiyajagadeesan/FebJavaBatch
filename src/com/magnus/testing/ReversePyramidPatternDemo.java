package com.magnus.testing;

public class ReversePyramidPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRow=10;
		for(int row=1;row<=totalRow-1;row++){
			for(int sp=1; sp<=row;sp++) {
				System.out.print(" ");
			}
			for(int st=1; st<=totalRow-row-1;st++){
			System.out.print(" *");
	}
			System.out.println();
	}

	}}
