import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesArrayList {

    static ArrayList<Integer> removeDuplicates(
            ArrayList<Integer> numbers) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (!result.contains(current)) {
                result.add(current);
            }
        }

        return result;
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

        System.out.println("Original: " + numbers);

        ArrayList<Integer> result = removeDuplicates(numbers);

        System.out.println("Without duplicates: " + result);

        sc.close();
    }
}