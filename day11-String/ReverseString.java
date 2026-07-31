import java.util.Scanner;

class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Reversed String: ");

        for(int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
-------------------------------------------------------
OUTPUT:
Enter a String:
Sandesh

Reversed String:
hsednaS