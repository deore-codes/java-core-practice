/*
 * Program          : Find Largest Element in an Array
 * Description      : Finds the largest element in an integer array using a single traversal.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */


import java.util.Scanner;

 public class MaxValueOfArray
{
	static int firstLargestNum(int no,int[] arr)
	{
		int max = arr[0];
		int i;
	
	for( i = 1; i<no ; i++)
	{
		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	return max; 
}

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	
	int[] arr = new int[no];
	
	for(int i=0; i <arr.length; i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println(firstLargestNum(no,arr));
}
}