/*
 * Program          : Greatest Common Divisor
 * Description      : Finds the GCD of two numbers using the Euclidean algorithm.
 * Time Complexity  : O(log n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class GCD {

    static int findGCD(int a, int b) {

        while (b != 0) {

            int remainder = a % b;

            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD: " + findGCD(a, b));

        sc.close();
    }
}