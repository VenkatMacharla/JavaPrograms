/*addAll()*/
/*remove()*/
/*containAll()*/
/*retainAll()---> will print the comman value from the 2 objects*/
package Collections;

import java.util.*;

public class Demo17
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		
		System.out.println(s1);
		
	/*adding the all HashSet objects to the 
	TreeSet object at a time using the addAll() method*/
		
		Set<Integer> s2=new TreeSet<Integer>();
		s2.addAll(s1);
		
		System.out.println(s2);
		
		Set<Integer> s3=new HashSet<Integer>(s2);
		System.out.println("Before deleting"+s3);
		/*remove() is a boolen method. 
		 returns true if the value is deleted.
		 (if the value is available in the list then only it will remove)*/
		
		/*here we are removing the one element from S3,
		  which is not in the set s3*/
		System.out.println(s3.remove(60));
		System.out.println(s3);
		System.out.println(s3.remove(30));
		System.out.println(s3);
		System.out.println(s1);
		/*containAll()*/
		System.out.println(s3.containsAll(s1));
		Set<Integer> s4=new HashSet<Integer>();
		s4.add(10);
		s4.add(20);
		/*retainAll()*/
		System.out.println(s4.retainAll(s3));
		
	}
}
