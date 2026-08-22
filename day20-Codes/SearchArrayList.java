/*
 * Program          : Search Element in ArrayList
 * Description      : Searches for an element and displays its index.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SearchArrayList {

    static void search(ArrayList<Integer> numbers, int target) {

        if (numbers.contains(target)) {

            int index = numbers.indexOf(target);

            System.out.println(
                    "Element found at index: " + index);

        } else {

            System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        search(numbers, target);

        sc.close();
    }
}