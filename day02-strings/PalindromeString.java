public class PalindromeNumber 
{
    public static void main(String[] args) 
	{
       		 int num = 121; // Change this value to test different numbers
        	int originalNum = num;
        	int reversedNum = 0;

        	// Mathematical loop to reverse the digits

       		 while (num > 0) 
		{
            		int digit = num % 10;         			 // Extract the last digit
            		reversedNum = (reversedNum * 10) + digit; 	// Build the reversed number
           	 	num = num / 10;               			// Remove the last digit
        	}

        	// Compare the reversed number with the original

        	if (originalNum == reversedNum) 
		{
           		 System.out.println(originalNum + " is a palindrome.");
        	} 
		else 
		{
           		 System.out.println(originalNum + " is not a palindrome.");
        	}
   	 }
}
