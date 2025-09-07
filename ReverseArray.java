package QA_Arrays_Code;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		//declare an array
		int a[]= {1,2,3,4,5,6};
		
		//before reverse array
		System.out.println("Before reverse of given arrays is: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		//after reverse array
		System.out.println("\nAfter reverse of given arrays is: ");
		for(int i=5;i>=0;i--)
		{
			System.out.print(a[i] + " ");
		}
	}
}
