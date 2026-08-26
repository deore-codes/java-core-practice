import java.util.ArrayList;
import java.util.Scanner;

public class GreaterThanAverage {

    static void printGreaterThanAverage(
            ArrayList<Integer> numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        double average = (double) sum / numbers.size();

        System.out.println("Average: " + average);

        System.out.println("Elements greater than average:");

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > average) {
                System.out.print(numbers.get(i) + " ");
            }
        }
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

        printGreaterThanAverage(numbers);

        sc.close();
    }
}