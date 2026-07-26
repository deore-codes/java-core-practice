import java.util.Scanner;

class ReverseArray
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

        System.out.println("\nOriginal Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nReversed Array:");

        for(int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}