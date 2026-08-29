import java.util.ArrayList;
import java.util.Scanner;

public class SumUniqueElements {

    static int findSum(ArrayList<Integer> numbers) {

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (!unique.contains(current)) {
                unique.add(current);
            }
        }

        int sum = 0;

        for (int i = 0; i < unique.size(); i++) {
            sum = sum + unique.get(i);
        }

        return sum;
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

        System.out.println("ArrayList: " + numbers);
        System.out.println("Sum of unique elements: "
                + findSum(numbers));

        sc.close();
    }
}