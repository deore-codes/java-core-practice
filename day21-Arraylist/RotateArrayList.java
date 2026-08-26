import java.util.ArrayList;
import java.util.Scanner;

public class RotateArrayList {

    static void rotate(ArrayList<Integer> numbers, int k) {

        int n = numbers.size();

        k = k % n;

        for (int count = 0; count < k; count++) {

            int last = numbers.remove(n - 1);

            numbers.add(0, last);
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

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        System.out.println("Before rotation: " + numbers);

        rotate(numbers, k);

        System.out.println("After rotation: " + numbers);

        sc.close();
    }
}