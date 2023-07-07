import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, powerOf4, powerOf5;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Powers of 4:");

        for (int i = 0; i <= number; i++) {
            powerOf4 = (int) Math.pow(4, i);
            System.out.println("4^" + i + " = " + powerOf4);
        }

        System.out.println("Powers of 5: ");

        for (int i = 0; i <= number; i++) {
            powerOf5 = (int) Math.pow(5, i);
            System.out.println("5^" + i + " = " + powerOf5);
        }
    }
}
