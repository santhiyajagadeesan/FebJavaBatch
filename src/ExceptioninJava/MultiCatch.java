package ExceptioninJava;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a[]= {10,20,30,60,70};
	String s=null;

	int b=a[1]/1;
	System.out.println(a[7]);
	s.length();
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("ArrayIndexOutOfBoundsException");
	System.out.println(e.getMessage());
}
catch(ArithmeticException e) {
	System.out.println("ArithmeticException");
	System.out.println(e.getMessage());
}

catch(NullPointerException e) {
	System.out.println("NullPointerException");
	System.out.println(e.getMessage());
}
//catch(RuntimeException e) {
//	
//}
//catch(Exception e) {
//	System.out.println("print exception");
//	System.out.println(e.getMessage());
//}
finally {
	System.out.println("End of the program");
}
	}

}
