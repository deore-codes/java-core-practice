/*
 * Program          : Contains Duplicate
 * Description      : Checks whether an array contains duplicate elements using HashSet.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
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

        if (containsDuplicate(arr)) {
            System.out.println("Duplicate exists");
        } else {
            System.out.println("No duplicate");
        }

        sc.close();
    }
}