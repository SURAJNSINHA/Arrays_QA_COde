package QA_Arrays_Code;

public class EvenOddArray 
{
	public static void main(String[] args) 
	{
		//declare an array
		int a[]= {10,20,21,30,31,41,60};
		
		int even=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even number are: " + a[i] + " ");
				even++;
				
			}
		}	
		
		System.out.println("Total even number is: " + even);
	}
}
