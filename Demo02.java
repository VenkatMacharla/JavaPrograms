/*
If the given three inputs are unique then product them.
otherwise if two inputs are same then print the third number 
which is not euivalent to these two numbers.  
 */
package Bnglr;

public class Demo02
{
	static int result;
	
	static void unique(int a, int b,int c)
	{
		System.out.println("===="+result);
		if(a!=b &&  b!=c && c!=a)
			result=a*b*c;
		else
			if((a==b &&  a!=c))
				result=c;
			else
				if(b==c && b!=a)
					result=a;
				else
					if(c==a && c!=b)
					result=b;
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		unique(1,2,3);
	}
}
