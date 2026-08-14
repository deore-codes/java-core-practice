/*
 * Program          : Find All Pairs with Given Sum
 * Description      : Finds all pairs of elements whose sum equals the target.
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class AllPairsWithSum {

    static void findPairs(int[] arr, int target) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println(
                            arr[i] + " + " + arr[j] + " = " + target);

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
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

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        findPairs(arr, target);

        sc.close();
    }
}