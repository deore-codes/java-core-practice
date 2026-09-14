import java.util.ArrayList;
import java.util.Scanner;

public class MiddleElementArrayList {

    static int findMiddle(ArrayList<Integer> numbers) {

        int middle = numbers.size() / 2;

        return numbers.get(middle);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("ArrayList cannot be empty.");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("ArrayList: " + numbers);
        System.out.println("Middle element: " + findMiddle(numbers));

        sc.close();
    }
}