import java.util.Scanner;

class CheckArraySorted
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

        boolean sorted = true;

        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                sorted = false;
                break;
            }
        }

        if(sorted)
        {
            System.out.println("Array is Sorted");
        }
        else
        {
            System.out.println("Array is Not Sorted");
        }

        sc.close();
    }
}
/*
INTPUT:
Enter array size:
5

Enter array elements:
10
50
30
40
20

OUTPUT:
Array is Not Sorted
*/