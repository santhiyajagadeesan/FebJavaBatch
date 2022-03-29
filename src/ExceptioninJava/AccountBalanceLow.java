package ExceptioninJava;

public class AccountBalanceLow  extends RuntimeException{
	AccountBalanceLow(String msg){
	super(msg);
}
}