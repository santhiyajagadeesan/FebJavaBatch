package ExceptioninJava;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=50;
try {
	System.out.println(a/0);
}
catch(Exception e) {
	e.printStackTrace();
	System.out.println(a/5);
	
}
System.out.println("this is end block");
}
	}
	
