import java.util.ArrayList;
import java.util.Scanner;

public class SeparateEvenOdd {

    static void separate(ArrayList<Integer> numbers) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (current % 2 == 0) {
                even.add(current);
            } else {
                odd.add(current);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
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

        separate(numbers);

        sc.close();
    }
}