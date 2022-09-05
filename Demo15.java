/*Retriving the map object values using the Iterator and map object*/
package Collections;

import java.util.*;
public class Demo15 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(10,"venkay");
		m.put(20,"muthu");
		m.put(30,"sheshi");
		m.put(40,"stanly");
		
		System.out.println(m);
		
		Set<Integer> s=m.keySet();
		Iterator<Integer> si=s.iterator();
		while(si.hasNext())
		{
			/*here the below satement will print only the values but not keys*/
			//System.out.println(m.get(si.next()));
			
			/*Now am printing the key and value using the map and Iterator object*/
			/*First we are storing the all the key objects in obj
			  then using that object we are printing the values*/
			Object obj=si.next();
			System.out.print("key is:"+obj);
			System.out.println(" Value is:"+m.get(obj));
		}
		
	}
}
