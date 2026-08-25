/*
 * Program          : Remove All Occurrences
 * Description      : Removes all occurrences of a specified element.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllOccurrences {

    static void removeAll(ArrayList<Integer> numbers, int target) {

        for (int i = numbers.size() - 1; i >= 0; i--) {

            if (numbers.get(i) == target) {
                numbers.remove(i);
            }
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

        System.out.print("Enter element to remove: ");
        int target = sc.nextInt();

        System.out.println("Before: " + numbers);

        removeAll(numbers, target);

        System.out.println("After: " + numbers);

        sc.close();
    }
}