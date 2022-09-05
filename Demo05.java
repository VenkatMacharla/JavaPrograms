/*Demonstrating the ListIterator Interface*/
/*hasNext(),  next(),  hasPrevious(), previous()
  are the methods available in the ListIterator Interface*/
package Collections;

import java.util.*;


public class Demo05 
{
	public static void main(String[] args) 
	{
		List li=new ArrayList();
		li.add(10);
		li.add("venkat");
		li.add("M");
		li.add(10);
		li.add("Warangal");
		
		//we can use both iterator and listiterator also for List
		//Iterator s1=li.iterator(); 
		ListIterator s1=li.listIterator();
		while(s1.hasNext())
		{
			System.out.println(s1.next());
		}
		
		
	}

}
