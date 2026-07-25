import java.util.Arrays;

class ArraysMethodsDemo
{
    public static void main(String[] args)
    {
        int arr[] = {5, 2, 8, 1, 9};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // 1. sort()
        Arrays.sort(arr);
        System.out.println("\n1. After sort()");
        System.out.println(Arrays.toString(arr));

        // 2. binarySearch()
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("\n2. binarySearch(8)");
        System.out.println("Index = " + index);

        // 3. copyOf()
        int copy[] = Arrays.copyOf(arr, arr.length);
        System.out.println("\n3. copyOf()");
        System.out.println(Arrays.toString(copy));

        // 4. copyOfRange()
        int range[] = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("\n4. copyOfRange(1,4)");
        System.out.println(Arrays.toString(range));

        // 5. fill()
        int fillArray[] = new int[5];
        Arrays.fill(fillArray, 100);
        System.out.println("\n5. fill()");
        System.out.println(Arrays.toString(fillArray));

        // 6. equals()
        System.out.println("\n6. equals()");
        System.out.println(Arrays.equals(arr, copy));

        // 7. compare()
        int arr2[] = {1, 2, 3, 4, 10};
        System.out.println("\n7. compare()");
        System.out.println(Arrays.compare(arr, arr2));

        // 8. mismatch()
        System.out.println("\n8. mismatch()");
        System.out.println(Arrays.mismatch(arr, arr2));

        // 9. hashCode()
        System.out.println("\n9. hashCode()");
        System.out.println(Arrays.hashCode(arr));

        // 10. deepToString()
        int matrix[][] =
        {
            {1,2},
            {3,4},
            {5,6}
        };

        System.out.println("\n10. deepToString()");
        System.out.println(Arrays.deepToString(matrix));
    }
}