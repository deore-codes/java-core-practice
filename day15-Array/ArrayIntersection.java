/*
 * Program          : Intersection of Two Arrays
 * Description      : Finds elements that are present in both arrays.
 * Time Complexity  : O(n * m)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class ArrayIntersection {

    static void findIntersection(int[] arr1, int[] arr2) {

        System.out.println("Intersection:");

        for (int i = 0; i < arr1.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr1[k] == arr1[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
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

        findIntersection(arr1, arr2);

        sc.close();
    }
}