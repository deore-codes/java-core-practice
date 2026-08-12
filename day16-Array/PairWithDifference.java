/*
 * Program          : Pair with Given Difference
 * Description      : Finds a pair of elements having the given difference.
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class PairWithDifference {

    static void findPair(int[] arr, int difference) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (Math.abs(arr[i] - arr[j]) == difference) {

                    System.out.println(
                            "Pair found: " + arr[i] + " and " + arr[j]);

                    return;
                }
            }
        }

        System.out.println("No pair found.");
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

        System.out.print("Enter difference: ");
        int difference = sc.nextInt();

        findPair(arr, difference);

        sc.close();
    }
}