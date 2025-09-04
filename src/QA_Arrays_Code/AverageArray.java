package QA_Arrays_Code;

public class AverageArray 
{

	public static void main(String[] args) 
	{
		//delcare an array
		int a[]= {10,20,30,40,50};
		
		int sum=0;
		int avg=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]; //sum is 150
			avg=sum/a.length; //avg is 30
		}
		
		System.out.println("Average array of given elements is: " + avg);
	}
}
