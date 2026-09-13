import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {

    static int findLongest(ArrayList<Integer> numbers) {

        if (numbers.size() == 0) {
            return 0;
        }

        int currentLength = 1;
        int longestLength = 1;

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) > numbers.get(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
            }
        }

        return longestLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("ArrayList cannot be empty.");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("ArrayList: " + numbers);

        System.out.println(
                "Longest increasing sequence length: "
                + findLongest(numbers));

        sc.close();
    }
}