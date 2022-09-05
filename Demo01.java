/*Set*/
/*In the Set the order of elements not in the storring order*/
/*Set will not allow the duplicates*/
/*we may not recognize the what element in any index*/
package Collections;

import java.util.*;

public class Demo01 
{
	public static void main(String[] args)
	{
		//HashSet is sub Class of the 'Set' Interface
		//we dont create object to an interface at any time
		//so we are creating the object of sub class of interface
		//i.e Set interface contain 2 sub classes HashSet & Treeset
		/*so we are creating the object for these classes and
		 *storing in the instance of the Set interface*/
		Set s=new HashSet();
		s.add(10);
		s.add("venkat");
		s.add("M");
		s.add(10);
		System.out.println(s);
	}
}
