/*
 * Program          : Longest Substring Without Repeating Characters
 * Description      : Finds the length of the longest substring without repeating characters using the Sliding Window technique.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeating 
{

    static int longestSubstring(String str) 
	{

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) 
	{

            while (set.contains(str.charAt(right))) 
		{
                set.remove(str.charAt(left));
                left++;
           	}

            set.add(str.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Longest Length: " + longestSubstring(str));

        sc.close();
    }
}