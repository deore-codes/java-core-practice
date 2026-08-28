import java.util.ArrayList;
import java.util.Scanner;

public class MostFrequentElement {

    static void findMostFrequent(ArrayList<Integer> numbers) {

        int mostFrequent = numbers.get(0);
        int maxCount = 0;

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);
            int count = 0;

            for (int j = 0; j < numbers.size(); j++) {

                if (numbers.get(j) == current) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = current;
            }
        }

        System.out.println(
                "Most frequent element: " + mostFrequent);

        System.out.println(
                "Frequency: " + maxCount);
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

        findMostFrequent(numbers);

        sc.close();
    }
}