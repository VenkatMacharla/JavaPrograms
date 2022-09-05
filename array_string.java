package Array1;

import java.util.Scanner;

public class array_string 
{
	public static void main(String[] args) 
	{
		String arr[]=new String[3];
		System.out.println("enter 3 names");
		Scanner s=new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) 
		{
			String name=s.next();
			arr[i]=name;
		}
		System.out.println("entered Names Are:");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
	}
}
