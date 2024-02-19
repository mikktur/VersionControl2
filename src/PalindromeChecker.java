import java.util.*;


public class PalindromeChecker {

    public static void main(String[] args) {
//this is where reader is created
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        String transformed = transformInput(input);
//this is where the "isPalindrome" is checked if it is true
        boolean isPalindrome = checkPalindrome(transformed);
        if (isPalindrome) {
            System.out.println("The input(transformed) is a palindrome.");
        } else {
            System.out.println("The input(transformed) isn't a palindrome.");
        }
    }

    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}