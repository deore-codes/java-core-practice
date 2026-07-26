import java.util.Scanner;

class MoveZerosToEnd
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

        int index = 0;

        // Move non-zero elements to the front
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while(index < arr.length)
        {
            arr[index] = 0;
            index++;
        }

        System.out.println("\nArray after moving zeros to the end:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
/*
INPUT:
Enter array size: 7

Enter array elements:
1
0
2
0
5
0
7

OUTPUT:
Array after moving zeros to the end:

1 2 5 7 0 0 0

*/