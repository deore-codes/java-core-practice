import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicatesArrayList {

    static ArrayList<Integer> findDuplicates(
            ArrayList<Integer> numbers) {

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            for (int j = i + 1; j < numbers.size(); j++) {

                if (current == numbers.get(j)
                        && !duplicates.contains(current)) {

                    duplicates.add(current);
                    break;
                }
            }
        }

        return duplicates;
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

        System.out.println(
                "Duplicate elements: "
                + findDuplicates(numbers));

        sc.close();
    }
}