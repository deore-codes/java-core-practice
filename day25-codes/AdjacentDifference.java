import java.util.ArrayList;
import java.util.Scanner;

public class AdjacentDifference {

    static void printDifference(ArrayList<Integer> numbers) {

        for (int i = 1; i < numbers.size(); i++) {

            int difference =
                    numbers.get(i) - numbers.get(i - 1);

            System.out.print(difference + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(
                    "At least two elements are required.");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Adjacent differences:");

        printDifference(numbers);

        sc.close();
    }
}