/*
 * Program          : Leaders in an Array
 * Description      : Finds elements that are greater than all elements to their right.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class ArrayLeaders {

    static void findLeaders(int[] arr) {

        int maxFromRight = arr[arr.length - 1];

        System.out.print("Leaders: " + maxFromRight + " ");

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > maxFromRight) {

                maxFromRight = arr[i];

                System.out.print(maxFromRight + " ");
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

        findLeaders(arr);

        sc.close();
    }
}