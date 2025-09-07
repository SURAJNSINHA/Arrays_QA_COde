package QA_Arrays_Code;

public class SortArrayUsing_BubbleSort 
{	
	public static void main(String[] args)
	{
		int a[]= {8,3,4,5,2,9,3};

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.print("Sorted array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}		
	}
}
