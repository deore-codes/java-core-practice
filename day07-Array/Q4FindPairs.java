/*
Q4.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers 
   in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
*/

import java .util.Random;
class Q4FindPairs
{
	public static void main(String args[])
	{
		int arr[] = {1, 5, 7, -1};
		int sum=6;
		
		System.out.println("ARRAY IS GIVEN ");
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			
		int cnt=0;
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1;  j<arr.length;  j++)
			{
			if(arr[i]+ arr[j] == sum)
			cnt ++;
			}
		}
		System.out.println(" number of pairs  whoes sum is 6 :  " +cnt);
	}
}
/*
=====================================
OUTPUT:

ARRAY IS GIVEN
1 5 7 -1
 number of pairs  whoes sum is 6 :  2

*/		
			