/*Using the BufferedReader*/
package Arrays;

import java.io.*;


public class DynamicInput 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("enter Eid,Ename");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int eid=Integer.parseInt(br.readLine());
		String ename=br.readLine();
		System.out.println(eid);
		System.out.println(ename);
		
	}

}
