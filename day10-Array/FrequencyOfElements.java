import java.util.Scanner;

class FrequencyOfElements
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        boolean visited[] = new boolean[size];

        System.out.println("Enter array elements:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nFrequency of each element:");

        for(int i = 0; i < arr.length; i++)
        {
            if(visited[i])
            {
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count + " times");
        }

        sc.close();
    }
}
-------------------------------------------------------
OUTPUT:
Enter array size: 8

Enter array elements:
10
20
10
30
20
20
40
10

Frequency of each element:

10 -> 3 times
20 -> 3 times
30 -> 1 times
40 -> 1 times