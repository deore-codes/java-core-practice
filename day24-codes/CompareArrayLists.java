import java.util.ArrayList;
import java.util.Scanner;

public class CompareArrayLists {

    static boolean areEqual(
            ArrayList<Integer> first,
            ArrayList<Integer> second) {

        if (first.size() != second.size()) {
            return false;
        }

        for (int i = 0; i < first.size(); i++) {

            if (!first.get(i).equals(second.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        System.out.print("Enter size of first list: ");
        int n = sc.nextInt();

        System.out.println("Enter first list:");

        for (int i = 0; i < n; i++) {
            first.add(sc.nextInt());
        }

        System.out.print("Enter size of second list: ");
        int m = sc.nextInt();

        System.out.println("Enter second list:");

        for (int i = 0; i < m; i++) {
            second.add(sc.nextInt());
        }

        if (areEqual(first, second)) {
            System.out.println("Both ArrayLists are equal.");
        } else {
            System.out.println("ArrayLists are not equal.");
        }

        sc.close();
    }
}