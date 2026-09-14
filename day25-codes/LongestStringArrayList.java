import java.util.ArrayList;
import java.util.Scanner;

public class LongestStringArrayList {

    static String findLongest(ArrayList<String> words) {

        String longest = words.get(0);

        for (int i = 1; i < words.size(); i++) {

            if (words.get(i).length() > longest.length()) {
                longest = words.get(i);
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

        String result = findLongest(words);

        System.out.println("Words: " + words);
        System.out.println("Longest element: " + result);
        System.out.println("Length: " + result.length());

        sc.close();
    }
}