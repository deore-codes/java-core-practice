/*
 * Program          : Sum of Even and Odd Elements
 * Description      : Calculates the sum of even and odd elements separately.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class SumEvenOdd {

    static void calculateSum(int[] arr) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
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

        calculateSum(arr);

        sc.close();
    }
}