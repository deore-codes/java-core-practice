import java.util.Scanner;

class CountEvenOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("\nEven Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);

        sc.close();
    }
}
------------------------------------------------------
OUTPUT:
Enter array size: 8

Enter array elements:
12
15
8
9
17
22
30
11

Even Count = 4
Odd Count = 4