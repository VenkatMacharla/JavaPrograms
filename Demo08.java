package Collections;

import java.util.*;
public class Demo08 
{
	public static void main(String[] args) 
	{
		/*'Set' will not accept Duplicates 
		 so only one null value will accept */
		Set s1=new HashSet();
		s1.add(10);
		s1.add("ABC");
		s1.add(null);
		s1.add(null);
		
		System.out.println(s1);
		
		/*The 'TreeSet' will store and display the 
		 object values in the Ascending order always 
		 for this it will use comareTo() method internally
		 this method will not allow the null vaues */
		/*Set s2=new TreeSet();
		s2.add(10);
		s2.add(29);
		s2.add("ABC");
		s2.add(null);
		s2.add(null);
		
		System.out.println(s2);*/
		
		List li=new ArrayList();
		li.add(10);
		li.add("ABC");
		li.add(null);
		li.add(null);
		System.out.println(li);
		
	}
}
