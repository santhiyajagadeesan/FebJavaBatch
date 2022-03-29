package CollectionsInJava;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList<>();
a1.add(90);
a1.add(10.67f);
a1.add(null);	
a1.add("audiQ7");
a1.add(90);
a1.add("java");
a1.add("Benz");
a1.add("Jaguar");
System.out.println(a1);
System.out.println(a1.get(5));
for(Object e:a1) {
	System.out.println(e);

}
//for(String names:a1) {
//	System.out.println(names);
//}
}
}