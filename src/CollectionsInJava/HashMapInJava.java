package CollectionsInJava;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> map =new HashMap();
map.put("Benz", 20);
map.put("Jaguar", 17);
map.put("Audi", 21);
System.out.println(map);
  
for(Entry<String, Integer> m:map.entrySet()) {
	System.out.println(m.getKey()+"\t"+m.getValue());
	
}
}}