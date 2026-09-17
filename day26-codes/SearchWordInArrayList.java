import java.util.ArrayList;
import java.util.Scanner;

public class SearchWordInArrayList {

    static ArrayList<String> searchWord(
            ArrayList<String> words, String target) {

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {

            if (words.get(i)
                    .toLowerCase()
                    .contains(target.toLowerCase())) {

                result.add(words.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter sentences:");

        for (int i = 0; i < n; i++) {
            words.add(sc.nextLine());
        }

        System.out.print("Enter word to search: ");
        String target = sc.nextLine();

        ArrayList<String> result =
                searchWord(words, target);

        System.out.println("Matching sentences: " + result);

        sc.close();
    }
}