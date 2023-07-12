import java.util.Scanner;

public class RecursivePrimeNumber {
    public static boolean isPrime(int number, int divisor){
        if(divisor == 1) return true;

        if(number % divisor == 0) return false;
        else return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
