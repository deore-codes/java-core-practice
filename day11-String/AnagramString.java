import java.util.Scanner;
import java.util.Arrays;

class AnagramString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length())
        {
            System.out.println("Strings are Not Anagrams");
        }
        else
        {
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1, ch2))
            {
                System.out.println("Strings are Anagrams");
            }
            else
            {
                System.out.println("Strings are Not Anagrams");
            }
        }

        sc.close();
    }
}