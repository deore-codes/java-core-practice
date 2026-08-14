/*
 * Program          : Longest Increasing Subarray
 * Description      : Finds the length of the longest continuously increasing subarray.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class LongestIncreasingSubarray {

    static int findLongest(int[] arr) {

        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {

                currentLength++;

            } else {

                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                "Longest increasing subarray length: "
                + findLongest(arr));

        sc.close();
    }
}