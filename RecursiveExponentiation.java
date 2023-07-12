import java.util.Scanner;

public class RecursiveExponentiation {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        int result = power(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
