import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Sorting the numbers in ascending order
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Sorted numbers: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Sorted numbers: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Sorted numbers: " + num2 + ", " + num1 + " " + num3);
            } else {
                System.out.println("Sorted numbers: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Sorted numbers: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Sorted numbers: " + num3 + ", " + num2 + ", " + num1);
            }
        }

        scanner.close();
    }
}