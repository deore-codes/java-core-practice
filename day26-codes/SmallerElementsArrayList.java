import java.util.ArrayList;
import java.util.Scanner;

public class SmallerElementsArrayList {

    static ArrayList<Integer> findSmaller(
            ArrayList<Integer> numbers, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < target) {
                result.add(numbers.get(i));
            }
        }

        return result;
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

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println(
                "Elements smaller than " + target + ": "
                + findSmaller(numbers, target));

        sc.close();
    }
}