import java.util.ArrayList;
import java.util.Scanner;

public class CountPositiveNegativeZero {

    static void countNumbers(ArrayList<Integer> numbers) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (current > 0) {
                positive++;
            } else if (current < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        countNumbers(numbers);

        sc.close();
    }
}