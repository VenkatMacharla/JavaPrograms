/*list*/
/*In the list the order of elements is same as storing order*/
/*Set will allow the duplicates*/
package Collections;

import java.util.*;

public class Demo02
{
	public static void main(String[] args) 
	{
		//ArrayList is a sub class of the List Interface
		List li=new ArrayList();
		li.add(10);
		li.add("venkat");
		li.add("M");
		li.add(10);
		li.add("Warangal");
		System.out.println(li);
	}
}
