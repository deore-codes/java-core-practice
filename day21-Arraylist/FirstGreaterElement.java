import java.util.ArrayList;
import java.util.Scanner;

public class FirstGreaterElement {

    static int findFirstGreater(
            ArrayList<Integer> numbers,
            int target) {

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > target) {
                return numbers.get(i);
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

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = findFirstGreater(numbers, target);

        if (result == -1) {
            System.out.println(
                    "No element greater than " + target);
        } else {
            System.out.println(
                    "First greater element: " + result);
        }

        sc.close();
    }
}