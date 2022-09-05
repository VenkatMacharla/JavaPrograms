/*Iterator*/
/*printing the elements of object using the iterator and hasNext*/
/*Iterator is an Interface*/
/*iterator() method is available in all collection classes*/
/*hasNext() & next() methods are available in the Iterator Interface*/

package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo04
{
	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add(10);
		s1.add("ABC");
		s1.add("10");
		s1.add("A");
		s1.add(10);
		
		Iterator i1=s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
