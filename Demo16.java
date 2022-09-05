package Collections;

import java.util.HashMap;
/*Removing the element from the Map object*/
/*we are using the remove() method to remove the elemets*/
import java.util.Map;

public class Demo16 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(10,"venkay");
		m.put(20,"muthu");
		m.put(30,"sheshi");
		m.put(40,"stanly");
		m.put(null, null);
		m.put(null, "POI");
		
		System.out.println(m);
		
		/*removing one element*/
		m.remove(10);
		System.out.println(m);
		System.out.println(m.containsKey(20));
	}
}
