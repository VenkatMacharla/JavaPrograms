/*printing the elements of object using for*/
/**/
package Collections;

import java.util.*;

public class Demo03
{
	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add(10);
		s1.add("ABC");
		s1.add("10");
		s1.add("A");
		
		//carefull about : in the for 
		//here 'Object' is 'java.lang.Object' class- super class for all the classes
		for(Object o:s1)
		{
			System.out.println(o);
		}
	}
}
