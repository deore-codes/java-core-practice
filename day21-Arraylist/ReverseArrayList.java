/*
 * Program          : Reverse ArrayList
 * Description      : Reverses an ArrayList using two-pointer technique.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {

    static void reverse(ArrayList<Integer> numbers) {

        int i = 0;
        int j = numbers.size() - 1;

        while (i < j) {

            int temp = numbers.get(i);

            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);

            i++;
            j--;
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

        System.out.println("Before reversing: " + numbers);

        reverse(numbers);

        System.out.println("After reversing: " + numbers);

        sc.close();
    }
}