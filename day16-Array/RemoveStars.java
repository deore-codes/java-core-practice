/*
 * Program          : Remove Stars from String
 * Description      : Removes the character before each '*' and removes the '*' itself.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.Scanner;

public class RemoveStars {

    static String removeStars(String str) {

        char[] arr = str.toCharArray();

        int i = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] == '*') {

                if (i > 0) {
                    i--;
                }

            } else {

                arr[i] = arr[j];
                i++;
            }
        }

        return new String(arr, 0, i);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeStars(str);

        System.out.println("After removing stars: " + result);

        sc.close();
    }
}