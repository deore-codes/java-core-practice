import java.util.Scanner;
class ArraySumUserInput
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter your array Size : ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
	
		System.out.println("Please enter your array element : ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Your Array is ::  ");
		int sum=0;

		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			System.out.println(a[i]);
		}
		System.out.println("The sum of total Array : "+sum);
		sc.close();
	}
}
/*
===================================================
OUTPUT:
Please enter your array Size :
5
Please enter your array element :
10
20
30
40
50
Your Array is ::
10
20
30
40
50
The sum of total Array : 150

*/
