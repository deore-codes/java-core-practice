/*
 * Program          : Count Occurrences of an Element
 * Description      : Counts how many times a given element occurs in an array.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class CountOccurrences {

    static int countOccurrences(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        return count;
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

        System.out.print("Enter element to count: ");
        int target = sc.nextInt();

        System.out.println(
                target + " occurs "
                + countOccurrences(arr, target)
                + " times");

        sc.close();
    }
}