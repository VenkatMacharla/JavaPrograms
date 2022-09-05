/*Demonstration on Generics*/
/*Generics are used to store the one type of values*/
package Collections;

import java.util.*;

public class Demo06 
{
	public static void main(String[] args) 
	{
		//Syntax for generics
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(10);
		s1.add(11);
		s1.add(12);
		s1.add(13);
		
		Iterator i1=s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
