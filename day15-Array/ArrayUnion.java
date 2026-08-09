/*
 * Program          : Union of Two Arrays
 * Description      : Finds all unique elements present in either of two arrays.
 * Time Complexity  : O(n + m)
 * Space Complexity : O(n + m)
 * Author           : Sandesh Deore
 */

import java.util.HashSet;
import java.util.Scanner;

public class ArrayUnion {

    static void findUnion(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.println("Union:");

        for (int num : set) {
            System.out.print(num + " ");
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

        findUnion(arr1, arr2);

        sc.close();
    }
}