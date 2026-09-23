import java.util.*;

public class ReverseLinkedListInGroups {

    static void reverseInGroups(LinkedList<Integer> list, int k) {

        if (k <= 1) {
            return;
        }

        for (int start = 0; start + k <= list.size(); start += k) {

            int left = start;
            int right = start + k - 1;

            while (left < right) {

                int temp = list.get(left);

                list.set(left, list.get(right));
                list.set(right, temp);

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int k = 3;

        System.out.println("Original List: " + list);

        reverseInGroups(list, k);

        System.out.println("After Reversal: " + list);
    }
}