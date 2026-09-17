import java.util.ArrayList;
import java.util.Scanner;

public class LongestStringByCharacter {

    static String findLongest(
            ArrayList<String> words, char target) {

        String longest = "";

        for (int i = 0; i < words.size(); i++) {

            String current = words.get(i);

            if (current.length() > 0
                    && Character.toLowerCase(current.charAt(0))
                    == Character.toLowerCase(target)) {

                if (current.length() > longest.length()) {
                    longest = current;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words.add(sc.nextLine());
        }

        System.out.print("Enter starting character: ");
        char target = sc.nextLine().charAt(0);

        String result = findLongest(words, target);

        if (result.isEmpty()) {
            System.out.println("No matching word found.");
        } else {
            System.out.println("Longest string: " + result);
        }

        sc.close();
    }
}