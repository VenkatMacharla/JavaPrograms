package Collections;

import java.util.*;

public class Demo18
{
	static List<Integer>subListMethod(List<Integer> li)
	{
		List<Integer> result=new ArrayList<Integer>();
		result=li.subList(0, 2);
		return result;
	}
	
	public static void main(String[] args) 
	{
		List<Integer> li1=new ArrayList<Integer>();
		li1.add(20);
		li1.add(10);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		
		System.out.println("Original list is: "+li1);
		Collections.sort(li1);
		System.out.println("Sorted list is:"+li1);
		
		List<Integer> li2=new ArrayList<Integer>(li1);
		List<Integer> li3=subListMethod(li2);
		System.out.println("Sub List is:"+li3);
	}
}
