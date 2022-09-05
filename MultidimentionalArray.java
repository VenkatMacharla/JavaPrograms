package Array1;

import java.util.Scanner;

public class MultidimentionalArray
{
	public static void main(String[] args) 
	{
		int m,n;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the dimentions");
		m=scr.nextInt();
		n=scr.nextInt();
		
		int st[][]=new int[m][n];
		System.out.println("Enter elements");
		
		for (int i = 0; i <m; i++) 
		{
			for (int j = 0; j <n; j++)
			{
				int num=scr.nextInt();
				st[i][j]=num;
			}
		}
		
		System.out.println("printing the values");
		
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.print(st[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}

}
