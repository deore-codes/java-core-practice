import java.util.ArrayList;
import java.util.Scanner;

public class MinimumElementIndex {

    static int findMinimumIndex(ArrayList<Integer> numbers) {

        int minIndex = 0;

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) < numbers.get(minIndex)) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("List cannot be empty.");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int index = findMinimumIndex(numbers);

        System.out.println("ArrayList: " + numbers);
        System.out.println("Minimum: " + numbers.get(index));
        System.out.println("Index: " + index);

        sc.close();
    }
}