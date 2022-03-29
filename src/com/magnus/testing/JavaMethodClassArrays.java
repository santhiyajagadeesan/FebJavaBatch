package com.magnus.testing;

import java.lang.reflect.Array;

public class JavaMethodClassArrays {

	public static void main(String[] args) {
		int [] numArray= {10,20,30,40,50};
		sumofArray(numArray);
	}
public static void sumofArray(int []numarray1) {
	int i;
			int sum=0;
	
	for(i=0;i<Array.getLength(numarray1);i++) {
		
		sum=sum+numarray1[i];
	}
		System.out.println("sum of all integers is="+sum);
	}
}

