import java.util.ArrayList;
import java.util.Scanner;

public class PairWithGivenSum {

    static void findPair(
            ArrayList<Integer> numbers, int target) {

        boolean found = false;

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i + 1; j < numbers.size(); j++) {

                if (numbers.get(i) + numbers.get(j) == target) {

                    System.out.println(
                            "Pair: "
                            + numbers.get(i)
                            + " + "
                            + numbers.get(j)
                            + " = "
                            + target);

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
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

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        findPair(numbers, target);

        sc.close();
    }
}