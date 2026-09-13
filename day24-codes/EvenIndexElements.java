import java.util.ArrayList;
import java.util.Scanner;

public class EvenIndexElements {

    static void printEvenIndexElements(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i += 2) {
            System.out.print(numbers.get(i) + " ");
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

        System.out.println("Elements at even indexes:");

        printEvenIndexElements(numbers);

        sc.close();
    }
}