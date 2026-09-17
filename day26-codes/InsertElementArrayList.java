import java.util.ArrayList;
import java.util.Scanner;

public class InsertElementArrayList {

    static void insertElement(
            ArrayList<Integer> numbers, int index, int value) {

        if (index < 0 || index > numbers.size()) {
            System.out.println("Invalid index.");
            return;
        }

        numbers.add(index, value);
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

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter element: ");
        int value = sc.nextInt();

        System.out.println("Before: " + numbers);

        insertElement(numbers, index, value);

        System.out.println("After: " + numbers);

        sc.close();
    }
}