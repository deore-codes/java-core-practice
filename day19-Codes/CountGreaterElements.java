/*
 * Program          : Count Elements Greater Than Given Number
 * Description      : Counts array elements greater than a specified number.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class CountGreaterElements {

    static int countGreater(int[] arr, int number) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > number) {
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

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println(
                "Elements greater than " + number + ": "
                + countGreater(arr, number));

        sc.close();
    }
}