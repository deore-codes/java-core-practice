import java.util.Scanner;

class FindMissingNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int arr[] = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}

/*
INPUT:
Enter value of N:
5

Enter 4 elements:
1
2
3
5

OUTPUT:
Missing Number = 4
*/