/*
 * Program          : Decimal to Binary
 * Description      : Converts a decimal number into its binary representation.
 * Time Complexity  : O(log n)
 * Space Complexity : O(log n)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class DecimalToBinary {

    static void convertToBinary(int number) {

        int[] binary = new int[32];
        int index = 0;

        while (number > 0) {

            binary[index] = number % 2;
            number = number / 2;
            index++;
        }

        System.out.print("Binary: ");

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Binary: 0");
        } else {
            convertToBinary(number);
        }

        sc.close();
    }
}