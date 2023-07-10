import java.util.Scanner;

public class GcdLcmCalculator {

    // Calculate the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int calculateGcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Calculate the Least Common Multiple (LCM) using GCD
    public static int calculateLcm(int num1, int num2) {
        int gcd = calculateGcd(num1, num2);
        return (num1 * num2) / gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, gcd, lcm;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        gcd = calculateGcd(num1, num2);
        lcm = calculateLcm(num1, num2);

        System.out.println("Greatest Common Divisor (EBOB) of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("Least Common Multiple (EKOK) of " + num1 + " and " + num2 + " is: " + lcm);

        input.close();
    }
}
