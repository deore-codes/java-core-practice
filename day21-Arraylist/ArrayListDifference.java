import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDifference {

    static ArrayList<Integer> findDifference(
            ArrayList<Integer> first,
            ArrayList<Integer> second) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < first.size(); i++) {

            int current = first.get(i);

            if (!second.contains(current)
                    && !result.contains(current)) {

                result.add(current);
            }
        }

        return result;
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

        System.out.println(
                "Elements only in first list: "
                + findDifference(first, second));

        sc.close();
    }
}