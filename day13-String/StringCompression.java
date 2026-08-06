/*
 * Program          : String Compression
 * Description      : Compresses consecutive repeated characters in a string.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */
import java.util.Scanner;

public class StringCompression {

    static String compressString(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        // Add the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        if (compressed.length() >= str.length()) {
            return str;
        }

        return compressed.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Compressed String: " + compressString(str));

        sc.close();
    }
}