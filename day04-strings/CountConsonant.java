/*
 * Program: Count Consonants
 * Description: Counts the number of consonants in a given string.
 * outpour: Enter a string: Hello World 123!
 * Total consonants: 7
 * Author: Sandesh Deore
 */

import java.util.Scanner;

class CountConsonant
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		//Convert the string to lowercase to simplify check
		str = str.toLowerCase();
		
		int count = 0;

		
		// Loop through each character of the string 
		for(int i=0; i < str.length(); i++)
		{
			char ch =str.charAt(i); 

		if(ch >= 'a' && ch <= 'z')
		{
			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
			{
                		count++;
            		}
		}
	}
	System.out.println("Total consonants: " + count);
	}
	sc.close();
			
}

		
			