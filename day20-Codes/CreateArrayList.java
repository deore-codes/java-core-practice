/*
 * Program          : Create and Print ArrayList
 * Description      : Creates an ArrayList, adds elements and prints them.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.ArrayList;

public class CreateArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("ArrayList: " + numbers);

        System.out.println("Elements:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("Size: " + numbers.size());
    }
}