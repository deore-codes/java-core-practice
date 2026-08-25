/*
 * Program          : Element Frequency in ArrayList
 * Description      : Counts the frequency of each unique element.
 * Time Complexity  : O(n²)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFrequency {

    static void findFrequency(ArrayList<Integer> numbers) {

        ArrayList<Integer> checked = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (checked.contains(current)) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < numbers.size(); j++) {

                if (numbers.get(j) == current) {
                    count++;
                }
            }

            System.out.println(current + " -> " + count);

            checked.add(current);
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

        findFrequency(numbers);

        sc.close();
    }
}