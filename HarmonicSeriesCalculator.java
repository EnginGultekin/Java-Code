import java.util.Scanner;

public class HarmonicSeriesCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        double harmonicSeriesSum = 0.0;

        for (int i = 1; i <= number; i++)
            harmonicSeriesSum += (1.0 / i);

        System.out.println("Harmonic series sum of " + number + " is: " + harmonicSeriesSum);
    }
}
