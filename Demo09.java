package Collections;

import java.util.*;

public class Demo09 
{
	public static void main(String[] args) 
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(40);
		li.add(30);
		li.add(50);
		li.add(10);
		
		/*Here we are using the Sort() method to arrange 
		  the object values in the ascending order. 
		  this method is available in the Collections Class*/
		Collections.sort(li);
		System.out.println(li);
		
		/*Now we want to print the object values 
		 in the descending order*/
		/*But no inbuilt method is available
		  so we will convert into the Array first 
		  then we will print in 
		  the reverse order using the for loop */
		
		/*be carefull about array type. i.e the below arr[]
		  Array must me in Object type because we are
		  storing the objects into array*/
		Object arr[]=li.toArray();
		for (int i = arr.length-1; i >=0 ; i--)
		{
			System.out.println(arr[i]);
		}
		
	}
}
