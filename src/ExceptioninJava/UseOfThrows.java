package ExceptioninJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UseOfThrows {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		UseOfThrows ut= new UseOfThrows();
		ut.m1();
	}
	
	void m1()throws FileNotFoundException{
	Readfile()	;
	}
void Readfile()throws FileNotFoundException {
	FileInputStream fs =new FileInputStream("/Users/santhiya/Desktop");
}
}
