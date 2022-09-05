/*commanly we will store the Predefined class type objects
  in generic objects*/
/*now we are storing the user defined class type objects*/
package Collections;

import java.util.*;
class Student
{
	private int id;
	private String name;
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}


public class Demo19 
{
	
	public static void main(String[] args) 
	{
		Student obj1=new Student();
		obj1.setId(10);
		obj1.setName("venkat");
		
		Student obj2=new Student();
		obj2.setId(20);
		obj2.setName("Nandhu");
		
		/*Here if we use the TreeSet object, it will give compareTo error because
		  TreeSet will internally use the compareTo method() to arrange the 
		  values in the ascending order. thats way TreeSet always display
		  the values in the sorted ascending order.*/
		/*compareTo() method will compare only values but not objects*/
		/*but in the HashSet, no compareTo() method to sort. 
		  it will display in random order with-out Sorting */
		/*Here we will contain the number of values in the each object.
		  we will add these number objects to the Set Reference.
		  So for printing the every value in the each object we will use the 
		  HashSet object*/
		
		
		Set<Student> s1=new HashSet<Student>();
		s1.add(obj1);
		s1.add(obj2);
	
		//System.out.println(s1);
		
		Iterator<Student> itr=s1.iterator();
		while(itr.hasNext())
		{
			Student stu=itr.next();
			//System.out.println(stu);
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			
		}
		
	}
}
