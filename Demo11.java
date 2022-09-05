/*Demonstration on Map*/
/*it will store in (key,value) pair format*/
/*key should be unique*/
/*if we give duplicate key it will not show the error 
  but the key which is allredy exist that will  
  modify with new  (key,value) pair*/
/*it will allow the null values as key and values also*/
/*when ever we are will pass the duplicate null key 
 the the previous null value will modified*/
/*put() method is used to add the elements into map*/
package Collections;

import java.util.*;

public class Demo11 
{
	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(10, "venkat");
		m.put("ABC",30);
		m.put("DEF","manohar");
		m.put(40, 50000);
		
		//duplicate key
		//m.put(10,"macharla");
		System.out.println(m);
	}
}
