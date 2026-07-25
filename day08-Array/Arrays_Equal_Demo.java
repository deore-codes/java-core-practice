import java.util.Arrays;

class Arrays_Equal_Demo
{
    public static void main(String[] args)
    {
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = {10, 20, 30, 40, 50};
        int arr3[] = {10, 20, 30, 40, 60};

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
        System.out.println("Array 3 : " + Arrays.toString(arr3));

        System.out.println();

        System.out.println("arr1.equals(arr2) : " + Arrays.equals(arr1, arr2));
        System.out.println("arr1.equals(arr3) : " + Arrays.equals(arr1, arr3));
    }
}