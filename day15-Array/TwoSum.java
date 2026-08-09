/*
 * Program          : Two Sum
 * Description      : Finds two indices whose elements add up to the target value.
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * Author           : Sandesh Deore
 */

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum 
{

    static void findTwoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: "
                        + map.get(complement) + ", " + i);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        findTwoSum(arr, target);

        sc.close();
    }
}