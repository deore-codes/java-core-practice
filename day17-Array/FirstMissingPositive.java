/*
 * Program          : First Missing Positive Number
 * Description      : Finds the smallest positive number missing from the array.
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class FirstMissingPositive {

    static int findMissingPositive(int[] arr) {

        int positive = 1;

        while (true) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == positive) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return positive;
            }

            positive++;
        }
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

        System.out.println(
                "First missing positive: "
                + findMissingPositive(arr));

        sc.close();
    }
}