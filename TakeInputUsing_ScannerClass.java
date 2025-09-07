package QA_Arrays_Code;

import java.util.Scanner;

public class TakeInputUsing_ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        // Ask for size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // Create array
        int[] arr = new int[size];

        // Take input
        System.out.println("Enter " + size + " numbers:");
        
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.print("Given array elements are: ");
        
        for (int i = 0; i < size; i++) 
        {
            System.out.print(arr[i] + " ");
        }
	}
}
