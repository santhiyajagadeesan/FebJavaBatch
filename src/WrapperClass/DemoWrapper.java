package WrapperClass;

public class DemoWrapper {
	private static int a=100;

	public static void main(String[] args) {
		System.out.println("value of a"+a);
		// TODO Auto-generated method stub
final int a=90;
Integer a1=new Integer(a);
System.out.println(a1);
Integer a2=a1.intValue();
System.out.println(a2);
	}

}
