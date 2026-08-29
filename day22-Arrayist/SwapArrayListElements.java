import java.util.ArrayList;
import java.util.Scanner;

public class SwapArrayListElements {

    static void swap(ArrayList<Integer> numbers, int i, int j) {

        int temp = numbers.get(i);

        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
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

        System.out.print("Enter first index: ");
        int i = sc.nextInt();

        System.out.print("Enter second index: ");
        int j = sc.nextInt();

        System.out.println("Before swap: " + numbers);

        swap(numbers, i, j);

        System.out.println("After swap: " + numbers);

        sc.close();
    }
}