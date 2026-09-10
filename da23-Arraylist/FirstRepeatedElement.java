import java.util.ArrayList;
import java.util.Scanner;

public class FirstRepeatedElement {

    static int findFirstRepeated(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i + 1; j < numbers.size(); j++) {

                if (numbers.get(i).equals(numbers.get(j))) {
                    return numbers.get(i);
                }
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

        int result = findFirstRepeated(numbers);

        if (result == -1) {
            System.out.println("No repeated element found.");
        } else {
            System.out.println(
                    "First repeated element: " + result);
        }

        sc.close();
    }
}