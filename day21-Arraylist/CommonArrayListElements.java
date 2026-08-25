/*
 * Program          : Common Elements in ArrayLists
 * Description      : Finds elements common to two ArrayLists.
 * Time Complexity  : O(n * m)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CommonArrayListElements {

    static ArrayList<Integer> findCommon(
            ArrayList<Integer> first,
            ArrayList<Integer> second) {

        ArrayList<Integer> common = new ArrayList<>();

        for (int i = 0; i < first.size(); i++) {

            int current = first.get(i);

            if (second.contains(current)
                    && !common.contains(current)) {

                common.add(current);
            }
        }

        return common;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        System.out.print("Enter size of first list: ");
        int n = sc.nextInt();

        System.out.println("Enter first list:");

        for (int i = 0; i < n; i++) {
            first.add(sc.nextInt());
        }

        System.out.print("Enter size of second list: ");
        int m = sc.nextInt();

        System.out.println("Enter second list:");

        for (int i = 0; i < m; i++) {
            second.add(sc.nextInt());
        }

        ArrayList<Integer> common = findCommon(first, second);

        System.out.println("Common elements: " + common);

        sc.close();
    }
}