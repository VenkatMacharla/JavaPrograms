/*
Input1={“ABX”,”ac”,”acd”};

Input2=3;
Output1=X$”d
if nth  element is empty then add ($”) in that place.
*/
package Bnglr;

public class Demo08 
{
	static void n_ltr_String(String s[],int n)
	{
		StringBuffer sb=new StringBuffer();
		//String cs="$"+"\"";
		for (int i = 0; i < s.length; i++) 
		{
			String a=s[i];
			if(a.length()>=3)
				sb.append(a.charAt(2));
			else
				sb.append("$\"");
		}
		System.out.println(sb.toString());
	}
	public static void main(String[] args) 
	{
		String str[]={"ABX","ac","acd"};
		n_ltr_String(str, 3);
	}
}
