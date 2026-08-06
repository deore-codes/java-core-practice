/*
 * Program          : Valid Anagram
 * Description      : Checks whether two strings are anagrams using character frequency.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class ValidAnagram {

    static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}