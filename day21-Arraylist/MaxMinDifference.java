import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinDifference {

    static int findDifference(ArrayList<Integer> numbers) {

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }

            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        return max - min;
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
                "Difference between max and min: "
                + findDifference(numbers));

        sc.close();
    }
}