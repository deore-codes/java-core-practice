import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumberArrayList {

    static int findMissing(ArrayList<Integer> numbers, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            actualSum = actualSum + numbers.get(i);
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(
                "Enter " + (n - 1) + " numbers from 1 to " + n + ":");

        for (int i = 0; i < n - 1; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println(
                "Missing number: " + findMissing(numbers, n));

        sc.close();
    }
}