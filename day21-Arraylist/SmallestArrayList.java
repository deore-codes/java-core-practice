import java.util.ArrayList;
import java.util.Scanner;

public class SmallestArrayList {

    static int findSmallest(ArrayList<Integer> numbers) {

        int smallest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }

        return smallest;
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
        System.out.println("Smallest: " + findSmallest(numbers));

        sc.close();
    }
}