/*
Given 2 int array A,B find (AUB)&(A intersection B) and find (A U B)-(A intersection B)
*/
package Bnglr;

import java.util.*;

public class Demo21 
{
	static void union_minus_intersection(int a[],int b[])
	{
		List<Integer> LA1=new ArrayList<Integer>();
		List<Integer> LA2=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			LA1.add(a[i]);
			LA2.add(a[i]);
		}
		List<Integer> LA3=new ArrayList<Integer>(LA1);
		
		List<Integer> LB1=new ArrayList<Integer>();
		List<Integer> LB2=new ArrayList<Integer>();
		
		System.out.println(LA1);
		
		for (int i = 0; i < b.length; i++)
		{
			LB1.add(b[i]);
			LB2.add(b[i]);
		}
		System.out.println(LB1);
		LA1.retainAll(LB1);
		System.out.println("retain"+LA1);
		LA1.addAll(LB1);
		System.out.println("A union B : ==> "+LA1);
		
		LA2.removeAll(LB1);
		System.out.println(LA2);
		
		
		LB1.removeAll(LA3);
		LA2.addAll(LB1);
		System.out.println(LA2);
		
		LA3.removeAll(LA2);
		System.out.println(LA3);
		
	}
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40};
		int b[]={30,40,50,60};
		union_minus_intersection(a, b);
	}
}
