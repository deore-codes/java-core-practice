/*
 * Program          : Isomorphic Strings
 * Description      : Checks whether two strings are isomorphic.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

    static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {

                if (map.get(c1) != c2)
                    return false;

            } else {

                if (map.containsValue(c2))
                    return false;

                map.put(c1, c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(isIsomorphic(s, t));

        sc.close();
    }
}