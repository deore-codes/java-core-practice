import java.util.*;

public class FirstNonRepeatingCharacterStream {

    static void processStream(char[] characters) {

        HashMap<Character, Integer> frequency = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : characters) {

            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);

            queue.offer(ch);

            while (!queue.isEmpty()
                    && frequency.get(queue.peek()) > 1) {

                queue.poll();
            }

            if (queue.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {

        char[] characters = {'a', 'a', 'b', 'c'};

        processStream(characters);
    }
}