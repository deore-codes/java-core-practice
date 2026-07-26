import java.util.Scanner;

class RemoveDuplicatesSortedArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        if(arr.length == 0)
        {
            System.out.println("Array is empty.");
            sc.close();
            return;
        }

        int i = 0;

        for(int j = 1; j < arr.length; j++)
        {
            if(arr[i] != arr[j])
            {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println("\nArray after removing duplicates:");

        for(int k = 0; k <= i; k++)
        {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}
/*
INPUT:
Enter array size:
8

Enter sorted array elements:
1
1
2
2
3
4
4
5

OUTPUT:

Array after removing duplicates:

1 2 3 4 5
*/