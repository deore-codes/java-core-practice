/*
 * Program          : Sort 0s, 1s and 2s
 * Description      : Sorts an array containing only 0, 1 and 2.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class SortZeroOneTwo {

    static void sortArray(int[] arr) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int num : arr) {

            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else {
                two++;
            }
        }

        int index = 0;

        while (zero > 0) {
            arr[index] = 0;
            index++;
            zero--;
        }

        while (one > 0) {
            arr[index] = 1;
            index++;
            one--;
        }

        while (two > 0) {
            arr[index] = 2;
            index++;
            two--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter only 0, 1 and 2:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}