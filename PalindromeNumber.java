import java.util.Scanner;

/* Ex.
    reversedNumber for 292, first `reversedNumber = 0`
    RM. = (reversedNumber * 10) + (num % 10)
    RM. = (0 * 10) + 2  = 2
    RM. = (2 * 10) + 9  = 20 + 9 = 29
    RM. = (0 * 10) + 2  = 290 + 2 = 292  --> this number is a palindrome
*/

public class PalindromeNumber {
    public static int isPalindrome(int num){
        int temp = num, reversedNumber = 0;

        while(temp != 0){
            reversedNumber = (reversedNumber * 10) + (temp % 10);
            temp /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int reversedNumber = isPalindrome(number);

        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
