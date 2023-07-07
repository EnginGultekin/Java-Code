import java.util.Scanner;

public class DigitSumCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int tempNumber = number, sum = 0, digit;

        while (tempNumber != 0) {
            digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }
        System.out.println("Sum of the digits of " + number + " is: " + sum);
    }
}