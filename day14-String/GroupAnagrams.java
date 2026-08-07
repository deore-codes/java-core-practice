/*
 * Program          : Group Anagrams
 * Description      : Groups words that are anagrams.
 * Time Complexity  : O(n × k log k)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){

            char[] ch = word.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){

        String[] words = {
                "eat","tea","tan",
                "ate","nat","bat"
        };

        System.out.println(groupAnagrams(words));
    }
}