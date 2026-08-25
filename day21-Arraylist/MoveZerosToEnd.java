import java.util.ArrayList;
import java.util.Scanner;

public class MoveZerosToEnd {

    static void moveZeros(ArrayList<Integer> numbers) {

        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) != 0) {

                int temp = numbers.get(index);
                numbers.set(index, numbers.get(i));
                numbers.set(i, temp);

                index++;
            }
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

        System.out.println("Before: " + numbers);

        moveZeros(numbers);

        System.out.println("After: " + numbers);

        sc.close();
    }
}