import java.util.Scanner;

// C(n,r) = n! / (r! * (n-r)!)

public class CombinationCalculator {

    // Factorial calculation
    public static int factorial(int num){
        if(num == 0) return 1;

        return num * factorial(num - 1);
    }

    // Combination calculation
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r;

        System.out.print("Enter the value of N: ");
        n = input.nextInt();

        System.out.print("Enter the value of R: ");
        r = input.nextInt();

        if (n >= r && n >= 0 && r >= 0) {
            System.out.println("Combination Result: " + combination(n, r));
        } else {
            System.out.println("Invalid input! N and R should be positive and N >= R.");
        }

    }
}
