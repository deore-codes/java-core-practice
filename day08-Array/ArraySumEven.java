import java.util.Scanner;
class ArraySumEven
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
			if(i%2==0)
			{
			sum=sum+a[i];
			}
			System.out.println(i+" => "+a[i]);
		}
		System.out.println("The sum of total Array : "+sum);
	}
}
/*
==================================
OUTPUT:
Please enter your array Size :
5
Please enter your array element :
12
14
16
9
7
Your Array is ::
0 => 12
1 => 14
2 => 16
3 => 9
4 => 7
The sum of total Array : 35
*/