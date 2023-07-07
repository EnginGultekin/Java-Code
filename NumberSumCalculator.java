import java.util.Scanner;

public class NumberSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers (enter a single number to stop): ");

        int sum = 0, number;

        while (true) {
            number = input.nextInt();

            if (number % 2 == 0) {
                sum += number;
            }
            else break;
        }

        System.out.println("Sum of even and multiples of 4: " + sum);
    }
}
