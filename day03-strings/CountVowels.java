/*
 * Program: Count Vowels in a String
 * Description: Counts the total number of vowels (a, e, i, o, u)
 * Author: Sandesh Deore
 */

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total number of vowels: " + count);

        sc.close();
    }
}