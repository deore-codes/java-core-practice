/*
 * Program      : Remove Duplicates from Sorted Array
 * Description  : Removes duplicate elements from a sorted array using the two-pointer technique.
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * Author       : Sandesh Deore
 */
import java.util.*;

public class RemoveDuplicatesFromSortedArray
{
	static int removeDuplicates(int[] arr)
	{
		int rd = 0;
		for(int i= 0 ;i < arr.length ; i++)
		{
			if(arr[rd] != arr[i])
			{
				rd++;
				arr[rd]= arr[i];
			}
		}
		return rd+1;
	}


	public static void main(String [] args)
	{
	    int [] arr ={2,2,3,3,4,4,5,5,6,6};
	    
	    System.out.println("Orignal Array ");

		for(int i= 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	
		int rd = removeDuplicates(arr);
		System.out.println();
		System.out.println("After remove duplicates and sorting the  Array ");
	
		for(int i= 0; i< rd; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}	