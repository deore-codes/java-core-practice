/*
 * Program          : Remove Element from ArrayList
 * Description      : Removes a specified integer from an ArrayList.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveArrayListElement {

    static void removeElement(
            ArrayList<Integer> numbers, int target) {

        if (numbers.remove(Integer.valueOf(target))) {

            System.out.println("Element removed.");

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

        System.out.println("Before removal: " + numbers);

        System.out.print("Enter element to remove: ");
        int target = sc.nextInt();

        removeElement(numbers, target);

        System.out.println("After removal: " + numbers);

        sc.close();
    }
}