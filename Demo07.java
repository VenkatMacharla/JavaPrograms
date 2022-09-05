/*Demonstratioon about the TreeSet and descendingSet() method*/
/*TreeSet will store and 
 display the object values in the ascending order*/
/*So it is not possible to compare the different types of valus
 thats way it will allow only one type of values*/


package Collections;

import java.util.*;

public class Demo07 
{
	public static void main(String[] args)
	{
		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(10);
		set1.add(40);
		set1.add(30);
		System.out.println(set1);
		
		/*to print the object values in the descending order */
		/*here we are creating the object for the Treeset class
		 Because the descendingSet() method is available in this Class*/
		/*here we are copining the values of the set1 object
		 into the set2 object directly-observe statement carefully*/
		
		TreeSet<Integer> set2=new TreeSet<Integer>(set1);
		System.out.println(set2.descendingSet());
		
		/*Here we are adding the values to object manually*/
		TreeSet<Integer> set3=new TreeSet<Integer>();
		set3.add(10);
		set3.add(40);
		set3.add(30);
		System.out.println(set3.descendingSet());
		
		
	}
	
}
