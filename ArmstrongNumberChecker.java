import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = input.nextInt();

        int number = originalNumber, result = 0, digit;
        int length = String.valueOf(number).length();

        while (number != 0) {
            digit = number % 10;
            result += Math.pow(digit, length);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
