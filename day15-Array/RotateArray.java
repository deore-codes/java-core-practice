/*
 * Program          : Rotate Array to Right
 * Description      : Rotates an array to the right by a given number of positions.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class RotateArray {

    static void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {

            int newIndex = (i + k) % n;

            temp[newIndex] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
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

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        rotate(arr, k);

        System.out.println("Array after rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}