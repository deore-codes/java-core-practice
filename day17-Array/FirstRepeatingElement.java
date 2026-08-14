/*
 * Program          : First Repeating Element
 * Description      : Finds the first element that occurs more than once.
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class FirstRepeatingElement {

    static int findFirstRepeating(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
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

        int result = findFirstRepeating(arr);

        if (result != -1) {
            System.out.println(
                    "First repeating element: " + result);
        } else {
            System.out.println("No repeating element found.");
        }

        sc.close();
    }
}