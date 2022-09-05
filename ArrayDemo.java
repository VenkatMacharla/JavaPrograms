package Array1;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		//int arr1[]={10,20,30};
		// int arr2[3]={10,20,30}; 
		//---above stment Error-dont specify the size of the array while initilizing the values to an array 
		int arr[]=new int[3];
		System.out.println("enter array elements");
		Scanner s=new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) 
		{
			int num=s.nextInt();
			arr[i]=num;
		}
		System.out.println("Array Elements Are:");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
