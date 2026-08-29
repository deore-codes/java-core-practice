import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceNegativeNumbers {

    static void replaceNegative(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0) {
                numbers.set(i, 0);
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

        System.out.println("Before: " + numbers);

        replaceNegative(numbers);

        System.out.println("After: " + numbers);

        sc.close();
    }
}