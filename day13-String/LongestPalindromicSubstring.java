/*
 * Program          : Longest Palindromic Substring
 * Description      : Finds the longest palindromic substring using the Expand Around Center technique.
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class LongestPalindromicSubstring {

    static String longestPalindrome(String str) {

        if (str == null || str.length() < 2) {
            return str;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {

            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);

            int maxLen = Math.max(len1, len2);

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    static int expandAroundCenter(String str, int left, int right) {

        while (left >= 0 &&
               right < str.length() &&
               str.charAt(left) == str.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Longest Palindrome: " + longestPalindrome(str));

        sc.close();
    }
}