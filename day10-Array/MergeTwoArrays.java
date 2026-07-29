import java.util.Scanner;

class MergeTwoArrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];

        System.out.println("Enter first array elements:");

        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];

        System.out.println("Enter second array elements:");

        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[size1 + size2];

        int index = 0;

        for(int i = 0; i < arr1.length; i++)
        {
            merge[index] = arr1[i];
            index++;
        }

        for(int i = 0; i < arr2.length; i++)
        {
            merge[index] = arr2[i];
            index++;
        }

        System.out.println("\nMerged Array:");

        for(int i = 0; i < merge.length; i++)
        {
            System.out.print(merge[i] + " ");
        }

        sc.close();
    }
}
-----------------------------------------------------------
OUTPUT:
Enter size of first array: 3

Enter first array elements:
10
20
30

Enter size of second array: 4

Enter second array elements:
40
50
60
70

Merged Array:

10 20 30 40 50 60 70