/*
 * Program          : Largest Element in ArrayList
 * Description      : Finds the largest element in an ArrayList.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class LargestArrayListElement {

    static int findLargest(ArrayList<Integer> numbers) {

        int largest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("ArrayList must contain at least one element.");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println(
                "Largest element: " + findLargest(numbers));

        sc.close();
    }
}