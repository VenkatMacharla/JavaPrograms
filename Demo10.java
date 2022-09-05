package Collections;

import java.util.*;

public class Demo10 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>(3);
		
		/*capacity() method will used display the size of the 
		  List object. it is available in the vector class*/
		/*In vector class the size will become double 
		  when we are adding the more one element than size of boject*/
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		
		/*Actually the size of the v1 is 3 (we specified).
		  now we adding one more elment to v1 
		  so, the size will become  double of 3 i.e (3*2=6)*/
		
		v1.add(40);
		System.out.println(v1.capacity());
		
		Enumeration<Integer> e=v1.elements();
		while (e.hasMoreElements()) 
		{
			
			System.out.println(e.nextElement());
		}
	}
}
