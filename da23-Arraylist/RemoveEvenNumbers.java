import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenNumbers {

    static void removeEven(ArrayList<Integer> numbers) {

        for (int i = numbers.size() - 1; i >= 0; i--) {

            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
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

        removeEven(numbers);

        System.out.println("After: " + numbers);

        sc.close();
    }
}