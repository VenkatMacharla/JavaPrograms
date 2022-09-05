package Bnglr;

import java.util.*;


public class Demo39 
{
	static void sum_max_min(int a[])
	{
		Set<Integer> set1=new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++)
		{
			set1.add(a[i]);
		}
		
		List<Integer> s=new ArrayList<Integer>(set1);
		
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		System.out.println("small number==="+s.get(0));
		System.out.println("second smallest:"+s.get(1));
		System.out.println("largest number==="+s.get(s.size()-1));
	}
	public static void main(String[] args) 
	{
		int a[]={12,13,12,19,2};
		sum_max_min(a);
	}
}
