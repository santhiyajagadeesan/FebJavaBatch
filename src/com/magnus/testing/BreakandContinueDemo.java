package com.magnus.testing;

public class BreakandContinueDemo {

	public static void main(String[] args) {
	
		for(int i=0;i<=10;i++)
		{
		
			if(i==7) {
				System.out.println(i);	
			break;
			
		}
			

	
else if(i==3){
			continue;
			
}
else{
		System.out.println(i);
}
			}
	}
}