import java.util.Scanner;

class LargestSmallestArray
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

        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }

            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }

        System.out.println("\nLargest Element = " + largest);
        System.out.println("Smallest Element = " + smallest);

        sc.close();
    }
}
--------------------------------------------
OUTPUT:
Enter array size: 6

Enter array elements:
45
78
12
9
67
100

Largest Element = 100
Smallest Element = 9