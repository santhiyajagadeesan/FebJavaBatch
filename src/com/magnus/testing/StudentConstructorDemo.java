package com.magnus.testing;

public class StudentConstructorDemo {
String name;
int rollnumber;
String address;

StudentConstructorDemo(String Studentname,int Studentrollnumber,String Studentaddress){
name=Studentname;
rollnumber=Studentrollnumber;
address=Studentaddress;
}


void Studentinfo() {
	
	System.out.println("name="+name);
	System.out.println("rollnumber="+rollnumber);
	System.out.println("address="+address);
}
	public static void main(String[] args) {
		
		StudentConstructorDemo  sandy =new StudentConstructorDemo ("sandy",88,"Madurai");
		
		sandy.Studentinfo();
	}

}
