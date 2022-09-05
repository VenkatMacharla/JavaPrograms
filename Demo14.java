package Collections;

import java.util.HashMap;
import java.util.Map;

public class Demo14
{
	public static void main(String[] args)
	{

		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(10,"venkat");
		m.put(30,"muthu");
		m.put(20,"manohar");
		m.put(40,"Stanly");
		
		/*map will allow the null values for key and values also*/
		m.put(null,null);
		System.out.println(m);
		
		/*modifing the null */
	}
}
