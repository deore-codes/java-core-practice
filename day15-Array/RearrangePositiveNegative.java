/*
 * Program          : Rearrange Positive and Negative Numbers
 * Description      : Places negative numbers first followed by positive numbers.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class RearrangePositiveNegative {

    static void rearrange(int[] arr) {

        int[] temp = new int[arr.length];

        int index = 0;

        // Add negative numbers
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Add positive numbers and zero
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Copy back to original array
        for (int i = 0; i < arr.length; i++) {
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

        rearrange(arr);

        System.out.println("Rearranged Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}