import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight, height, result;

        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight ");
        weight = input.nextDouble();

        result =  weight / Math.pow(height, 2);
        System.out.println("Your Body Mass Index: " + result);
    }
}
