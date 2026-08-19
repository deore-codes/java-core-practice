/*
 * Program          : Closest Element in Array
 * Description      : Finds the element closest to a given target number.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class ClosestElement {

    static int findClosest(int[] arr, int target) {

        int closest = arr[0];

        int difference = Math.abs(arr[0] - target);

        for (int i = 1; i < arr.length; i++) {

            int currentDifference =
                    Math.abs(arr[i] - target);

            if (currentDifference < difference) {

                difference = currentDifference;
                closest = arr[i];
            }
        }

        return closest;
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

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println(
                "Closest element: "
                + findClosest(arr, target));

        sc.close();
    }
}