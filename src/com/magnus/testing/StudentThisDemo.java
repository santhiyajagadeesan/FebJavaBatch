package com.magnus.testing;

public class StudentThisDemo {

	String name;
	int rollnumber;
	String address;

	StudentThisDemo(String name,int rollnumber,String address){
	this.name=name;
	this.rollnumber=rollnumber;
	this.address=address;
	}


	void Studentinfo() {
		
		System.out.println("name="+name);
		System.out.println("rollnumber="+rollnumber);
		System.out.println("address="+address);
	}
		public static void main(String[] args) {
			
			StudentThisDemo sandy =new StudentThisDemo("sandy",88,"Madurai");
			
			sandy.Studentinfo();
		}
}
	

