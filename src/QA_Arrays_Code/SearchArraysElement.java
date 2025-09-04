package QA_Arrays_Code;

public class SearchArraysElement 
{
	public static void main(String[] args) 
	{
		//declare an array
		int a[]= {10,20,30,40,50};
		
		//search the element
		int search=301;
		boolean found=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("element are found" + " " + search + " " + "at index position is: " + i);
				found=true; //stops after find the element
			}
		}
		if(!found)
		{
			System.out.println("element are not found");
		}
	}

}
