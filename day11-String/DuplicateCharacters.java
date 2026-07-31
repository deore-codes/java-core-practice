import java.util.Scanner;

class DuplicateCharacters
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        boolean visited[] = new boolean[str.length()];

        System.out.println("\nDuplicate Characters:");

        for(int i = 0; i < str.length(); i++)
        {
            if(visited[i] || str.charAt(i) == ' ')
            {
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                    visited[j] = true;
                }
            }

            if(count > 1)
            {
                System.out.println(str.charAt(i) + " -> " + count);
            }
        }

        sc.close();
    }
}