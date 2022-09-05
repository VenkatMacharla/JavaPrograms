/*usin the scanner Class*/
package Arrays;

import java.util.Scanner;

public class Dynamic_Scanner 
{
	public static void main(String[] args) 
	{
		System.out.println("enter eid,ename");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		String name=s.next();
		System.out.println(id);
		System.out.println(name);
	}
}
