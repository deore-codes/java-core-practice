/*
 * Program          : Subarray with Given Sum
 * Description      : Finds a continuous subarray whose elements add up to the target sum.
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class SubarrayGivenSum {

    static void findSubarray(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum == target) {

                    System.out.println(
                            "Subarray found from index "
                            + i + " to " + j);

                    return;
                }
            }
        }

        System.out.println("No subarray found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        findSubarray(arr, target);

        sc.close();
    }
}