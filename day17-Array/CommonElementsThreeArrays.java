/*
 * Program          : Common Elements in Three Sorted Arrays
 * Description      : Finds elements common to three sorted arrays.
 * Time Complexity  : O(n + m + p)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class CommonElementsThreeArrays {

    static void findCommon(int[] arr1, int[] arr2, int[] arr3) {

        int i = 0;
        int j = 0;
        int k = 0;

        System.out.println("Common elements:");

        while (i < arr1.length &&
               j < arr2.length &&
               k < arr3.length) {

            if (arr1[i] == arr2[j] &&
                arr2[j] == arr3[k]) {

                System.out.print(arr1[i] + " ");

                i++;
                j++;
                k++;
            }

            else if (arr1[i] < arr2[j]) {
                i++;
            }

            else if (arr2[j] < arr3[k]) {
                j++;
            }

            else {
                k++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter first sorted array:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter second sorted array:");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Enter size of third array: ");
        int p = sc.nextInt();

        int[] arr3 = new int[p];

        System.out.println("Enter third sorted array:");

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }

        findCommon(arr1, arr2, arr3);

        sc.close();
    }
}