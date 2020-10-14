import java.util.*;
class PalindromeUsingRecursion
{
    public static boolean isPalindrome(String str)
    {   
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1, str.length()-1));
		}
        return false;
    }
	
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String stringInput = scanner.nextLine();
		if (stringInput.length() == 0)
		{
			System.out.println("Given String is null, Enter a valid string");
		}
		else {
			if(isPalindrome(stringInput))
				System.out.println(stringInput + " is a palindrome");
			else
				System.out.println(stringInput + " is not a palindrome");
		}
    }
}