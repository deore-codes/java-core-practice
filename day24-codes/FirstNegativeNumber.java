import java.util.ArrayList;
import java.util.Scanner;

public class FirstNegativeNumber {

    static int findFirstNegative(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0) {
                return numbers.get(i);
            }
        }

        return -1;
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

        int result = findFirstNegative(numbers);

        if (result == -1) {
            System.out.println("No negative number found.");
        } else {
            System.out.println("First negative number: " + result);
        }

        sc.close();
    }
}