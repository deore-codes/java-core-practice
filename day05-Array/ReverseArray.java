/*
 * Program      : Reverse Array
 * Description  : Reverses the given integer array using the two-pointer technique.
 * Author       : Sandesh Deore
 */

import java.util.*;

public class ReverseArray
{
	static void reverse(int[] arr)
	{
		int i= 0;
		int j= arr.length-1;
	
		while(i < j)
		{
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			
			i++;
			j--;
		}
	}
public static void main(String args[])
{
	int arr[] = {2,4,6,8,12,34,56,29,7,23};
	
	System.out.println("Before reversing : ");
	
	for(int i= 0;i< arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	reverse(arr);

	System.out.println("\nAfter reversing : ");
	
	for(int i= 0;i< arr.length; i++)
	{
		System.out.print(arr[i] + " ");
	}

}
}
