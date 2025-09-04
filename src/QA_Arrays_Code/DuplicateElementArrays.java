package QA_Arrays_Code;

public class DuplicateElementArrays 
{
	public static void main(String[] args)
	{
		//declare an array 
		int a[]= {1,2,3,3,2,4,5};
		
		System.out.println("Duplicate elements in an given array is: ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) 
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
