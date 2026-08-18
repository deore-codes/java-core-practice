/*
 * Program          : Compare Two Arrays
 * Description      : Checks whether two arrays contain the same elements in the same order.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class CompareArrays {

    static boolean areEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter first array:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter second array:");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        if (areEqual(arr1, arr2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        sc.close();
    }
}