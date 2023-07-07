import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0, count = 0;
        double average = 0.0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            average = (double) sum / count;
        }

        System.out.println("Average of numbers divisible by 3 and 4 from 0 to " + number + ": " + average);
    }
}
