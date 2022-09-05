package Array1;

import java.util.Scanner;

public class StudentArray 
{
	int id;
	String name;
	public StudentArray(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter how many students details u want to enter");
		int m;
		m=scr.nextInt();
		StudentArray sobj[]=new StudentArray[m];
		
		//System.out.println("enter Student Details");
		for (int i = 1; i <=sobj.length; i++)
		{
			System.out.println("enter "+i+" Student Details");
			int id=scr.nextInt();
			String name=scr.next();
			sobj[i]=new StudentArray(id, name);
		}
		for (int i = 0; i < sobj.length; i++) 
		{
			System.out.println("id is:"+sobj[i].id);
			System.out.println("name is:"+sobj[i].name);
		}
	}

}
