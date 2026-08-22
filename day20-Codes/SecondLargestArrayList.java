/*
 * Program          : Second Largest Element in ArrayList
 * Description      : Finds the second largest distinct element.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargestArrayList {

    static int findSecondLargest(ArrayList<Integer> numbers) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (current > largest) {

                secondLargest = largest;
                largest = current;

            } else if (current > secondLargest
                    && current != largest) {

                secondLargest = current;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(
                    "At least two elements are required.");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int result = findSecondLargest(numbers);

        if (result == Integer.MIN_VALUE) {
            System.out.println(
                    "Second largest distinct element does not exist.");
        } else {
            System.out.println(
                    "Second largest: " + result);
        }

        sc.close();
    }
}