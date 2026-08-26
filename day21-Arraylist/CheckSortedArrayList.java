import java.util.ArrayList;
import java.util.Scanner;

public class CheckSortedArrayList {

    static boolean isSorted(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i) > numbers.get(i + 1)) {
                return false;
            }
        }

        return true;
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

        if (isSorted(numbers)) {
            System.out.println("ArrayList is sorted.");
        } else {
            System.out.println("ArrayList is not sorted.");
        }

        sc.close();
    }
}