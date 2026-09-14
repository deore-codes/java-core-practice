import java.util.ArrayList;
import java.util.Scanner;

public class CountGreaterElements {

    static int countGreater(
            ArrayList<Integer> numbers, int target) {

        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > target) {
                count++;
            }
        }

        return count;
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

        System.out.println(
                "Count of elements greater than "
                + target + ": "
                + countGreater(numbers, target));

        sc.close();
    }
}