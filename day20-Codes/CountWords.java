/*
 * Program          : Count Words in Sentence
 * Description      : Counts the number of words in a sentence.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class CountWords {

    static int countWords(String sentence) {

        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println(
                "Number of words: " + countWords(sentence));

        sc.close();
    }
}