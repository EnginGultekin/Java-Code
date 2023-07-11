import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum = 0, secondNum = 1, nextNum;

        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int count = input.nextInt();

        System.out.print("Fibonacci series of " + count + " elements: ");

        if (count >= 1) {
            System.out.print(firstNum);
        }

        for (int i = 2; i <= count; i++) {
            System.out.print(", " + secondNum);

            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
