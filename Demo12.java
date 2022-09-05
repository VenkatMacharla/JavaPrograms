/*creating the generic Map object-
 *to allow the perticular type keys and values */
package Collections;

import java.util.HashMap;

import java.util.Map;

public class Demo12 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(10,"venkat");
		m.put(30,"muthu");
		m.put(20,"manohar");
		m.put(40,"Stanly");
		
		//here below statement is error because m is generic object
		//it will allow only (Integer,String) pair values only
		//m.put("ABC", 30);
	}
}
