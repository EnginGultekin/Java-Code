import java.util.Scanner;

public class TemperatureRecommendations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        int temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("I recommend skiing.");
        } else if (temperature >= 5 && temperature <= 15) {
            System.out.println("I recommend going to the cinema.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("I recommend having a picnic.");
        } else if (temperature > 25) {
            System.out.println("I recommend swimming.");
        } else {
            System.out.println("Invalid temperature value.");
        }

        scanner.close();
    }
}