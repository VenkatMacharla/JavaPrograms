/*
input1=845.690, output=3:2;
Input1=20.789; output=2:3;
Input1=20.0; output=2:1;  output is in Hashmap format.

*/
package Bnglr;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Demo37 
{
	static void left_right(float a)
	{
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
		String s=String.valueOf(a);
		System.out.println(s);
		StringTokenizer t=new StringTokenizer(s,".");
		String left=t.nextToken();
		String right=t.nextToken();
		m.put(left.length(), right.length());
		System.out.println(m);
	}
	public static void main(String[] args) 
	{
		float a=203.650f;
		left_right(a);
	}
}
