import java.util.Scanner;
class ArraySerchElement
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your Array Size : ");
	int size=sc.nextInt();

	int a[]=new int[size];
	System.out.println("Please enter your array element : ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	
	System.out.println("Enter yournumber which elements you wants to serch  : ");
	int element=sc.nextInt();
	
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==element)
		{
			count++;
			break;
		}
	}
	if(count==1)
	{
		System.out.println("Element present in Array : ");
	}
	else
	{
		System.out.println("Element not Present in Array : ");
	}
	}
}
/*
==============================================
OUTPUT:

C:\Users\JARVIS\Desktop\javakappa\Array class work>java ArraySerchElement.java
Please enter your Array Size :
5
Please enter your array element :
10
20
30
40
50
Enter yournumber which elements you wants to serch  :
40
Element present in Array :

C:\Users\JARVIS\Desktop\javakappa\Array class work>java ArraySerchElement.java
Please enter your Array Size :
5
Please enter your array element :
1020
20
30
40
50
Enter yournumber which elements you wants to serch  :
60
Element not Present in Array :
*/