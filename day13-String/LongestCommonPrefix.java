/*
 * Program          : Longest Common Prefix
 * Description      : Finds the longest common prefix among an array of strings.
 * Time Complexity  : O(n × m)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] arr) {

        if (arr == null || arr.length == 0) {
            return "";
        }

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {

            while (!arr[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr));

        sc.close();
    }
}