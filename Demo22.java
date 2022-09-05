/*
Return true if an int array has same 3 consective no 
Eg: if input1={1,2,3,2,4,4,4}
Return true;
*/
package Bnglr;

public class Demo22 
{
	static void consucutive(int a[])
	{
		int m=0;
		for (int i = 0; i < a.length-2; i++)
		{
			if(a[i]==a[i+1] && a[i+1]==a[i+2])
			{
				//System.out.println("true");
				m=1;
				break;
			}
			else
				m=2;
		}
		if(m==1)
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,2,4,4};
		consucutive(arr);
	}
}
