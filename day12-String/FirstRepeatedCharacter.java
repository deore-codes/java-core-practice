import java.util.Scanner;

class FirstRepeatedCharacter
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
            for(int j = i + 1; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    System.out.println("First Repeated Character = " + str.charAt(i));
                    found = true;
                    break;
                }
            }

            if(found)
            {
                break;
            }
        }

        if(!found)
        {
            System.out.println("No Repeated Character Found.");
        }

        sc.close();
    }
}