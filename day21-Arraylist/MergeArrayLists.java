import java.util.ArrayList;
import java.util.Scanner;

public class MergeArrayLists {

    static ArrayList<Integer> merge(
            ArrayList<Integer> first,
            ArrayList<Integer> second) {

        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(first);
        result.addAll(second);

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

        ArrayList<Integer> result = merge(first, second);

        System.out.println("Merged ArrayList: " + result);

        sc.close();
    }
}