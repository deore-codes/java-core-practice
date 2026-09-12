import java.util.ArrayList;
import java.util.Scanner;

public class LastOccurrenceArrayList {

    static int findLastOccurrence(
            ArrayList<Integer> numbers, int target) {

        for (int i = numbers.size() - 1; i >= 0; i--) {

            if (numbers.get(i) == target) {
                return i;
            }
        }

        return -1;
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

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = findLastOccurrence(numbers, target);

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Last occurrence index: " + index);
        }

        sc.close();
    }
}