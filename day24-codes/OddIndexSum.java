import java.util.ArrayList;
import java.util.Scanner;

public class OddIndexSum {

    static int findSum(ArrayList<Integer> numbers) {

        int sum = 0;

        for (int i = 1; i < numbers.size(); i += 2) {
            sum = sum + numbers.get(i);
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

        System.out.println(
                "Sum of odd index elements: "
                + findSum(numbers));

        sc.close();
    }
}