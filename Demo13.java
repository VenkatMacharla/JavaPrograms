/*Retriving the keys and values from the map object*/
/*keySet()--> for retriving the keys*/
/*values()--> for retriving the values*/
/*entrySet()--> for retriving the (key,value) at a time*/

package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo13
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(10,"venkat");
		m.put(30,"muthu");
		m.put(20,"manohar");
		m.put(40,"Stanly");
		 
		System.out.println(m);
		
		Set<Integer> s=m.keySet();
		Iterator<Integer> itr=s.iterator();
		
		System.out.println("Keys Are:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Values are:");
		Collection<String> v1=m.values();
		Iterator<String> itr2=v1.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}	
		
		System.out.println("(key,values) pairs are:");
		Set s1=m.entrySet();
		Iterator itr3=s1.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		
	}	
}
