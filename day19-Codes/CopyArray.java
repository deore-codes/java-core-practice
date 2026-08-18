/*
 * Program          : Copy Array
 * Description      : Copies elements from one array into another array.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class CopyArray {

    static int[] copyArray(int[] arr) {

        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        return copy;
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

        int[] copy = copyArray(arr);

        System.out.println("Copied array:");

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}