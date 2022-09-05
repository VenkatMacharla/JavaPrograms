package Array1;

public class ArraySort 
{
	int[] Sort(int[] arr)
	{
		int num;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					num=arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}
			}
			
		}
		
		return arr;
	}
	    
	    
	public static void main(String[] args) 
	{
		int arr[]={43,26,98,12,59,7};
		ArraySort as=new ArraySort();
		int output[]=as.Sort(arr);
		for (int i = 0; i < output.length; i++)
		{
		System.out.println(output[i]);	
		}
	}

}
