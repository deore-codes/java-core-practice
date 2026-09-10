import java.util.ArrayList;
import java.util.Scanner;

public class AveragePositiveNumbers {

    static double findAverage(ArrayList<Integer> numbers) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > 0) {

                sum = sum + numbers.get(i);
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
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

        System.out.println(
                "Average of positive numbers: "
                + findAverage(numbers));

        sc.close();
    }
}