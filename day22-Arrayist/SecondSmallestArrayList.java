import java.util.ArrayList;
import java.util.Scanner;

public class SecondSmallestArrayList {

    static int findSecondSmallest(ArrayList<Integer> numbers) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (current < smallest) {

                secondSmallest = smallest;
                smallest = current;

            } else if (current < secondSmallest
                    && current != smallest) {

                secondSmallest = current;
            }
        }

        return secondSmallest;
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

        int result = findSecondSmallest(numbers);

        if (result == Integer.MAX_VALUE) {
            System.out.println(
                    "Second distinct smallest element does not exist.");
        } else {
            System.out.println(
                    "Second smallest: " + result);
        }

        sc.close();
    }
}