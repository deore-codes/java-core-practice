import java.util.Scanner;

class RotateArrayRight
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

        int last = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("\nArray after right rotation:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
--------------------------------------------------------
OUTPUT:
Enter array size: 5

Enter array elements:
10
20
30
40
50

Array after right rotation:

50 10 20 30 40