import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPalindrome {

    static boolean isPalindrome(ArrayList<Integer> numbers) {

        int i = 0;
        int j = numbers.size() - 1;

        while (i < j) {

            if (!numbers.get(i).equals(numbers.get(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
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

        if (isPalindrome(numbers)) {
            System.out.println("ArrayList is palindrome.");
        } else {
            System.out.println("ArrayList is not palindrome.");
        }

        sc.close();
    }
}