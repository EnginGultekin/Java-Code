import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {
        System.out.print("How many numbers will you enter: ");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Number: ");
            number = input.nextInt();
            result += number;
        }
        System.out.println("Result : " + result + "\n");
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();
        int number, result = 0;

        for (int i = 0; i < count; i++) {
            if (i == 0) {
                System.out.print("Enter which number to subtract from: ");
                number = input.nextInt();
                result += number;
                continue;
            } else {
                System.out.print(i + ". Number to subtract: ");
                number = input.nextInt();
                result -= number;
            }
        }
        System.out.println("Result : " + result + "\n");
    }

    static void times() {
        System.out.print("How many numbers will you enter: ");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int number, result = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Number: ");
            number = input.nextInt();
            result *= number;
        }
        System.out.println("Result : " + result + "\n");
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number to divide: ");
        double number = input.nextDouble();
        double divisor;
        boolean isOk = true;

        while (isOk) {
            System.out.print("Enter divisor: ");
            divisor = input.nextDouble();
            if (divisor == 0) {
                System.out.println("You cannot enter the divisor 0");
                continue;
            }
            else {
                number /= divisor;
            }

            System.out.println("Result: " + number);

            while(true){
                System.out.print("Do you want to continue or not 1/0: ");
                int choice = input.nextInt();
                if (choice != 1) {
                    isOk = false;
                }
                break;
            }
        }
        System.out.println();
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result " + base + "^" + exponent + " = " + result + "\n");
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Result of " + num + "! = " + result + "\n");
    }

    static void modding() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter the number to get the mod: ");
        int mod = input.nextInt();

        System.out.println("Result of " + num + " % " + mod + " = " + (num % mod) + "\n");
    }

    static void recAreaPerimeterCal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the long side: ");
        int longEdge = input.nextInt();

        System.out.print("Enter the short side: ");
        int shortEdge = input.nextInt();

        System.out.println("Rectangular Area: " + shortEdge * longEdge);
        System.out.println("Rectangular Perimeter: " + 2 * (shortEdge + longEdge));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Retrieval\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Log out";

        do {
            System.out.println(menu);
            System.out.print("Please select an action: ");
            select = input.nextInt();
            System.out.println();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modding();
                    break;
                case 8:
                    recAreaPerimeterCal();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
        } while (select != 0);
    }
}