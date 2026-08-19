/*
 * Program          : Replace Negative Numbers with Zero
 * Description      : Replaces every negative number in an array with zero.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class ReplaceNegativeWithZero {

    static void replaceNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                arr[i] = 0;
            }
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

        replaceNegative(arr);

        System.out.println("Updated array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}