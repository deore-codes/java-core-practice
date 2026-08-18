/*
 * Program          : Last Occurrence in Array
 * Description      : Finds the last index of a given element in an array.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class LastOccurrence {

    static int findLastOccurrence(int[] arr, int target) {

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                index = i;
            }
        }

        return index;
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

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = findLastOccurrence(arr, target);

        if (result != -1) {
            System.out.println("Last occurrence index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}