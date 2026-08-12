/*
 * Program          : Maximum Difference Between Two Elements
 * Description      : Finds the maximum difference where the larger element appears after the smaller element.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class MaximumDifference {

    static int findMaximumDifference(int[] arr) {

        int minimum = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {

            int difference = arr[i] - minimum;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        return maxDifference;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                "Maximum difference: "
                + findMaximumDifference(arr));

        sc.close();
    }
}