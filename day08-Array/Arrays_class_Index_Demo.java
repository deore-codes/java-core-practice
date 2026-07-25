import java.util.Arrays;
class Arrays_class_Index_Demo
{
	public static void main(String [] args)
	{
	int a[]={1,2,3,4,5,6};
	
	System.out.println("Given Array  : ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	int index =Arrays.binarySearch(a,4);
	System.out.println("\n Index of element 4 is : "+index);
	}
}