import java.util.Scanner;
class ArrayMultiOdd
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Please enter your Array Size : ");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("Enter array elements : ");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("Your array is: ");
	
	int mul=1;
	for(int i=0;i<a.length;i++)
	{
		
		if((i+1)%2==1)
		{
			mul=mul*a[i];
		}
		System.out.println(i+" => "+a[i]);
	}
	System.out.println("Multiplication of elements at odd positions is: : "+mul);
	sc.close();
	}
	
}