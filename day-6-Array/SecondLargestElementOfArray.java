/*
 * Program: Second Largest Element in an Array
 * Description: Finds the second largest distinct element
 * without sorting the array using a single traversal.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Sandesh Deore
 */

import java.util.*;

public class SecondLargestElementOfArray
{
    static int secondLargest(int[] arr)
    {
        if(arr.length < 2)
        {
            return -1;
        }

        int max1;
        int max2;

        if(arr[0] > arr[1])
        {
            max1 = arr[0];
            max2 = arr[1];
        }
        else
        {
            max1 = arr[1];
            max2 = arr[0];
        }

        for(int i = 2; i < arr.length; i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1)
            {
                max2 = arr[i];
            }
        }

        return max2;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int result = secondLargest(arr);

        if(result == -1)
        {
            System.out.println("Second Largest Element does not exist.");
        }
        else
        {
            System.out.println("Second Largest Element = " + result);
        }

        sc.close();
    }
}