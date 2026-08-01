import java.util.Scanner;

class FirstNonRepeatedCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        boolean found = false;

        for(int i = 0; i < str.length(); i++)
        {
            int count = 0;

            for(int j = 0; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }

            if(count == 1)
            {
                System.out.println("First Non-Repeated Character = " + str.charAt(i));
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("No Non-Repeated Character Found.");
        }

        sc.close();
    }
}