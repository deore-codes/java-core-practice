/*
 * Program          : Equilibrium Index
 * Description      : Finds an index where left and right side sums are equal.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class EquilibriumIndex {

    static int findEquilibriumIndex(int[] arr) {

        int totalSum = 0;

        for (int num : arr) {
            totalSum = totalSum + num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum = leftSum + arr[i];
        }

        return -1;
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

        int index = findEquilibriumIndex(arr);

        if (index != -1) {
            System.out.println("Equilibrium index: " + index);
        } else {
            System.out.println("No equilibrium index found.");
        }

        sc.close();
    }
}