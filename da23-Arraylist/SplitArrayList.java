import java.util.ArrayList;
import java.util.Scanner;

public class SplitArrayList {

    static void split(ArrayList<Integer> numbers) {

        int mid = numbers.size() / 2;

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            first.add(numbers.get(i));
        }

        for (int i = mid; i < numbers.size(); i++) {
            second.add(numbers.get(i));
        }

        System.out.println("First half: " + first);
        System.out.println("Second half: " + second);
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

        System.out.println("Original: " + numbers);

        split(numbers);

        sc.close();
    }
}