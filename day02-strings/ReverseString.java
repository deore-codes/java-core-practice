package day01.oops;
import java.util.Scanner;
public class ReverseString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = sc.nextLine();
		
		char[] arr = input.toCharArray();
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right)
		{
			char temp = arr[left];
			arr[left] = arr [right];
			arr[right] = temp;
			
			left ++;
			right --;
		}
		
		System.out.println("Reverse String is : "+new String(arr));

	}

}
