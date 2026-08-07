/*
 * Program          : Roman to Integer
 * Description      : Converts a Roman numeral to an integer.
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * Author           : Sandesh Deore
 */

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

    static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++){

            if(i < s.length()-1 &&
               map.get(s.charAt(i)) < map.get(s.charAt(i+1))){

                sum -= map.get(s.charAt(i));

            }else{

                sum += map.get(s.charAt(i));

            }
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(romanToInt(s));

        sc.close();
    }
}