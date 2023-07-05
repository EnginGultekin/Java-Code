import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.println("Select the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Make your choice (1-4): ");
        int choice = input.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        input.close();
    }
}
