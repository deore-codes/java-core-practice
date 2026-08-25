/*
 * Program          : Sort ArrayList
 * Description      : Sorts an ArrayList in ascending order manually.
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {

    static void sort(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size() - 1; i++) {

            for (int j = 0; j < numbers.size() - 1 - i; j++) {

                if (numbers.get(j) > numbers.get(j + 1)) {

                    int temp = numbers.get(j);

                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
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

        System.out.println("Before sorting: " + numbers);

        sort(numbers);

        System.out.println("After sorting: " + numbers);

        sc.close();
    }
}